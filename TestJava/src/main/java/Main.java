public class Main {

    public static void main(String[] args) {
        int oc = 500000;
        double cof = 1.2;
        int years = 29;//ввод вашего срока полезного использования

        amortiz1(oc, years);//линейный способ
        amortiz2(oc, years);//нелинейный способ. Метод СЧЛ
        amortiz3(oc, years, cof);//нелинейный способ. Метод уменьшаемого остатка
    }

    static int yearSum(int years) {
        int result = 0;
        for(int i = 1; i < years+1; i++) {
            result+=i;
        }
        return result;
    }

    static void amortiz1(int oc, int years) {
        System.out.println("Линейный способ--------------------------------");
        double p = (1.0 / years)*100;
        double p1 = (int)(p*100);
        System.out.println("На = "+p1/100+"%");
        for (int i = years, k = 1; i > 0; i--, k++)
        {
            double a = oc * (p1/10000);
            System.out.println("АО"+k+" = "+a+"p");
        }
    }

    static void amortiz2(int oc, int years) {
        System.out.println("Нелинейный способ. Метод суммы/чисел/лет--------------------------------");
        for (int i = years, k = 1; i > 0; i--, k++)
        {
            double p = ((double)i / yearSum(years))*100;
            double p1 = (int)(p*100);
            double a = oc * (p1/10000);
            System.out.println("На"+k+" = "+p1/100+"%\nАО"+k+" = "+a+"p\n");
        }
    }

    static void amortiz3(int oc, int years, double cof) {
        System.out.println("Нелинейный способ. Метод уменьшаемого остатка---------------------------");
        double a = 0;
        double p = (1.0 / years)*cof*100;
        double p1 = (int)(p*100);
        System.out.println("На = "+p1/100+"%");
        int f = 0;
        for (int i = 1; i < years+1; i++) {
            double val = oc-f;
            a = val * (p1/10000);
            f+=a;
            if(i==years) {
                a = val;
            }
            System.out.println("АО"+i+" = "+a+"p");
        }
    }
}
