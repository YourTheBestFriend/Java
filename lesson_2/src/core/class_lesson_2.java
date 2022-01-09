package core;
//Для консольного ввода
import java.util.Scanner;

public class class_lesson_2 {
	public static void main(String[] args)
	{
		System.out.println("\ntask 2");
		int[] array = {0,1,2,-4,4,5};
		
		for (int i = array.length-1;i >= 0;i--)
		{
			System.out.println(array[i]);
		}
		System.out.println("\ntask 3");
		int sum = 0;
		for (int i = 0;i <= array.length-1;i++)
		{
			sum += array[i];
		}
		System.out.println("sum = " + sum);
		System.out.println("\ntask 4");
		for (int i = 0;i<=array.length-1;i++)
		{
			array[i] *= 3;
			System.out.println(array[i]);
		}
		System.out.println("all * 3");
		
		System.out.println("\ntask 5");
		int flag_check_0 = 0;
		for (int i = 0;i<=array.length-1;i++)
		{
			if (array[i] == 0)
			{
				flag_check_0++;
			}
		}
		if (flag_check_0 >= 0) 
		{
			System.out.println("Кол-во нулей = " + flag_check_0);
		}
		System.out.println("\ntask 6");
		int min = array[0];
		int index = 0;
		for (int i = 1;i<=array.length-1;i++)
		{
			if (min > array[i])
			{
				min = array[i];	
				index = i;
			}
		}
		System.out.println("Min: " + min + " index: " + min);
		System.out.println("\ntask 7");
		System.out.println("array[0]" + array[0]);
		System.out.println("array[last]" + array[array.length-1]);
		
		array[0] = array[0] ^ array[array.length-1];
		array[array.length-1] = array[0] ^ array[array.length-1];
		array[0] = array[0] ^ array[array.length-1];
		
		System.out.println("convert");
		System.out.println("array[0]" + array[0]);
		System.out.println("array[last]" + array[array.length-1]);
		
	}
}
