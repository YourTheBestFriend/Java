package core;
// Для консольного ввода
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// Task 
		System.out.println("Hello " + "Matvey");
		int q = 10;
		double w = 8.7;
		char e = '$';
		// short g;
		System.out.println("q = " + q + " " + "w = " + w + " " + "e = " + e);
	
		// Task 1
		System.out.println("\nTask 1");
		int a = 10, b = 8, c = 4;
		if (a > b && a > c)
		{
			System.out.println("the biggest - a");
		}
		else 
		{
			if (b > a && b > c) 
			{
				System.out.println("the biggest - b");
			}
			else
			{
				System.out.println("the biggest - c");
			}	
		}
			
		// Task 2
		System.out.println("\nTask 2");
		int i = 0;
		// 1
		do
		{
			System.out.println(i);
			i++;
		}while(i < 16);
		// 2
		System.out.println();
		while (i > 0)
		{
			i--;
			System.out.println(i);
		}
		// 3
		System.out.println();
		for (int j = i; j < 16; j++)
		{
			System.out.println(j);
		}
		// Консольный ввод import java.util.Scanner;
		Scanner in = new Scanner(System.in);
		// next() - считывает введенную строку до первого пробела
		// nextLine() - считывает всю введенную строку
		// nextInt() - Считывает введенное число int
		// nextDouble() - Считывает введенное число double
		// hasNext() - проверяет, было ли введено слово
		// hasNextInt() - проверяет, было ли введено число int
		// hasNextDouble - проверяет, было ли введено число double
		/* По анологии - nextByte(), nextShort(), nextFloat(), nextBoolean()*/
		System.out.println("Введите число: ");
		int h = in.nextInt();
		System.out.println(h);
		
		System.out.println("Введите строку: (Считает с первого пробела)");
		String str = in.next();
		System.out.println(str);
		
//		System.out.println("Введите строку: ");
//		String str2 = in.nextLine();
//		System.out.println(str2);
		
		// Работа с массивами
		int[] array = new int[] {1,2,3,4,5};
		int array2[] = new int[] {1,2,3,4,5}; // тоже самое
		int[] array3 = {1,2,3,4,5};
		// Установливаю значения в массив
		int arr_point[] = new int[2];
		arr_point[0] = 3;
		arr_point[1] = 6;
		// Длина массива
		int len = arr_point.length;
		// последние индекс элемента = length-1
		
		// Двумерный 
		int[][] double_array = { { 0, 1, 2 }, { 3, 4, 5 } };
		
		// Зубчатый массив
		int[][] teeth_arr = new int[3][];
		teeth_arr[0] = new int[2];
		teeth_arr[1] = new int[3];
		teeth_arr[2] = new int[5];
		
		/*
		 foreach
		Специальная версия цикла for предназначена для перебора элементов в наборах элементов, 
		например, в массивах и коллекциях. Она аналогична действию цикла foreach , 
		который имеется в других языках программирования. Формальное ее объявление:
		
		for (тип_данных название_переменной : контейнер){
    	// действия
		}	
		 */
		int[] array12 = new int[] { 1, 2, 3, 4, 5 };
		for (int k : array12){
		             
		    System.out.println(k);
		}
		
		/*
		 В качестве контейнера в данном случае выступает массив данных типа int.
		 Затем объявляется переменная с типом int
		 То же самое можно было бы сделать и с помощью обычной версии for:
		 
		 int[] array = new int[] { 1, 2, 3, 4, 5 };
		 for (int i = 0; i < array.length; i++){
    	 	System.out.println(array[i]);
	 	 }
		 
		 В то же время эта версия цикла for более гибкая по сравнению for (int i : array). 
		 В частности, в этой версии мы можем изменять элементы:
		 
		 int[] array = new int[] { 1, 2, 3, 4, 5 };
		 for (int i=0; i<array.length;i++){
    		array[i] = array[i] * 2;
    		System.out.println(array[i]);
		 }
		 */
		
		// Перебор многомерных массивов в цикле
		
		int[][] nums = new int[][] 
				{ 
				    {1, 2, 3},
				    {4, 5, 6},
				    {7, 8, 9}
				};
				for (int i1 = 0; i1 < nums.length; i1++){
				    for(int j1=0; j1 < nums[i1].length; j1++){
				             
				        System.out.printf("%d ", nums[i1][j1]);
				    }
				    System.out.println();
				}
		
	}
}
