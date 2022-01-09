package core;
import java.util.Scanner;

public class class_laba_1 {
	public static void main(String[] args) {
		System.out.println("laba_1 task_1");
		Task1 obj1 = new Task1();
		//obj1.eql();
		
		System.out.println("\nlaba_1 task_2");
		Task2 obj2 = new Task2();
		//obj2.task2();
		
		System.out.println("\nlaba_1 task_3");
		Task3 obj3 = new Task3();
		//obj3.task3();
		
		System.out.println("\nlaba_1 task_5");
		Task4 obj4 = new Task4();
		obj4.task4();
		
		System.out.println("\nlaba_1 task_5");
		Task5 obj5 = new Task5();
		//obj5.task5();
		
	}		
}


// variant 6

// make variant 2 in first task
class Task1 {
	double x;
	public void eql() {
		x = Math.pow(4, 2) - 2 * 4;
		System.out.println("Ответ = " + x);
	}
}

class Task2 {
	// 7, 2, 3, 4, 277, 6, 77
	int[] array = new int[] {7, 2, 77, 275, 6, 266, 877, 27, 45, 658, 727, 277};
	int my_check_num = array[0] % 10;
	public void task2()
	{
		for (int i = 1;i < array.length;i++)
		{
			if (Math.abs(array[i]) > 9) // Значит двухзначное
			{
				if (array[i] % 10 == my_check_num && ((int)(array[i] / 10)) % 10 == my_check_num)
				{
					System.out.println("index [" + i + "]: element = " + array[i]);
				}
			}
			else
			{
				if (array[i] % 10 == my_check_num)
				{
					System.out.println("index [" + i + "]: element = " + array[i]);
				}
			}
			
		}
	}
	
}

class Task3 {
	int[][] nums = new int[][] 
			{ 
			    {1, 2, 10, 6},
			    {4, 5, 6, 7},
			    {7, 8, 9, 4}
			};
	// 0 1 2 3 4 5 6 7 8 9 ----- 10 / 2 = 5
	public void task3() 
	{
		int len = 0;
		for (int i = 0;i < nums.length;i++)
		{
			for (int j = 0;j < nums.length;j++)
			{
				if ((i + j) % 2 == 0)
				{
					len++;
				}
			}
		}
		int[] array = new int[len];
		int key = 0;
		for (int i = 0; i <  nums.length;i++)
		{
			for (int j = 0; j <  nums.length;j++)
			{
				if ((i + j) % 2 == 0)
				{
					array[key] = nums[i][j];
					key++;
				}
			}
		}
		for (int i = 0;i < len;i++)
		{
			System.out.println("array[" + i + "]:= " + array[i]);
		}
	}
	
}
class Task4 {
	Scanner in = new Scanner(System.in);
	public void task4() 
	{
		System.out.println("Введите номер задания: ");
		int p = in.nextInt();
		switch(p)
		{
		// 1
		case 1:
			System.out.println("Введите num: ");
			int num = in.nextInt();
			System.out.println("Введите num: ");
			int n_delitel = in.nextInt();
			if (num % n_delitel == 0)
			{
				System.out.println("Делится без остатка");
			}
			else
			{
				System.out.println("Делится с остатком");
			}
		// 2
		case 2:
		{
			int x = 6;
			switch(x)
			{
			case 1:
				System.out.println("Один");
				break;
			case 2:
				System.out.println("Два");
				break;
			case 3:
				System.out.println("Три");
				break;
			case 4:
				System.out.println("Четыре");
				break;
			case 5:
				System.out.println("Пять");
				break;
			case 6:
				System.out.println("Шэсть");
				break;
			case 7:
				System.out.println("Семь");
				break;
			case 8:
				System.out.println("Восемь");
				break;
			case 9:
				System.out.println("Девять");
				break;
			default:
				System.out.println("Вы не выбрали");
				break;
			}

			break;
		}
		// 3
		case 3:
			System.out.println("Введите номер недели: ");
			int day_week = in.nextInt();
			switch(day_week)
			{
			case 1:
				System.out.println("Понедельник");
				break;
			case 2:
				System.out.println("Вторник");
				break;
			case 3:
				System.out.println("Среда");
				break;
			case 4:
				System.out.println("Четверг");
				break;
			case 5:
				System.out.println("Пятница");
				break;
			case 6:
				System.out.println("Суббота");
				break;
			case 7:
				System.out.println("Воскресенье");
				break;
			}
		// 4
		case 4:
			System.out.println("Введите Название столицы: ");
			String stolica = in.next();
			switch(stolica)
			{
			case "Минск":
				System.out.println("Беларусь");
				break;
			case "Москва":
				System.out.println("Россия");
				break;
			case "Киев":
				System.out.println("Украина");
				break;
			case "Токио":
				System.out.println("Япония");
				break;
			case "Варшава":
				System.out.println("Польша");
				break;
			case "Берлин":
				System.out.println("Германия");
				break;
			}
		// 5
		case 5:
			System.out.println("Введите n: ");
			int n = in.nextInt();
			int sum = 0;
			int i = 0;
			while (i < n)
			{
				if (i % 2 != 0)
				{
					sum += i;	
				}
				i++;
			}
			System.out.println("sum = " + sum);
		// 6
		case 6:
			System.out.println("Введите n: ");
			int n2 = in.nextInt();
			int proizv = 1;
			int j = 0;
			while (j < n2)
			{
				if (j % 2 != 0)
				{
					proizv *= j;	
				}
				j++;
			}
			System.out.println("proizv = " + proizv);
		// 7
		case 7:
			System.out.println("Введите вес в кг: ");
			double ves = in.nextDouble();
			System.out.println("Введите рост в см: ");
			double rost = in.nextDouble();
			double procent = (rost - 100) * 0.1;
			if (ves >= (rost - 100)-procent && (ves <= (rost - 100)+procent))
			{
				System.out.println("Вес в норме");
			}
			else
			{
				if (ves < (rost - 100)- procent)
				{
					System.out.println("Нужно поправиться");
				}
				else
				{
					System.out.println("Нужно похудеть");
				}
			}
		}

	}
	
}
class Task5 {
	public void task5() // от 100-150 выводит все целые числа
	{
		for (int i = 100;i < 151;i++)
		{
			if (i % 2 == 0)
			{
				System.out.print("number = " + i + '\t');
			}	
		}
	}
	
}



