// Гончаров Матвей Николаевич Т-992
public class MyClass_Arr {
    public static class ClassTask_ {
        double x;
        double array[];
        ClassTask_(double x, double array[]) {
            this.x = x;
            this.array = array;
        }
        public void Arr() {
            double znach;
            double first;
            double second;

            double arr_2[][] =  new double[this.array.length][this.array.length];

            for (int i = 0; i < this.array.length; i++) {
                for (int j = 0; j < this.array.length; j++) {
                    first = this.array[i];
                    second = this.array[j];
                    znach = first / second;
                    arr_2[i][j] = znach;
                    System.out.println(arr_2[i][j]);
                }
            }

            // index 1 and 2
            int index1 = 0;
            int index2 = 0;
            double reserv = Math.abs(this.x - arr_2[0][0]);
            for (int i = 0; i < this.array.length; i++) {
                for (int j = 0; j < this.array.length; j++) {
                    double reserv_2 = (Math.abs(this.x - arr_2[i][j])) * 10;
                    if (reserv > reserv_2) {
                        index1 = i;
                        index2 = j;
                        reserv = reserv_2;
                    }
                }
            }
            System.out.println("Ближе к = " + this.x);
            System.out.println("First znach: " + this.array[index1] + " index1 = " + index1);
            System.out.println("Second znach: " + this.array[index2] + " index2 = " + index2);
        }
    }
    public static void main(String[] args) {
        double x = 4.5;
        double array[] = {2.5, 3.5, 4.6, 8.3, 3.5};
        ClassTask_ test = new ClassTask_(x, array);
        test.Arr();
    }
}
