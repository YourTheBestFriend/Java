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
		System.out.println("����� = " + x);
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
			if (Math.abs(array[i]) > 9) // ������ �����������
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
		System.out.println("������� ����� �������: ");
		int p = in.nextInt();
		switch(p)
		{
		// 1
		case 1:
			System.out.println("������� num: ");
			int num = in.nextInt();
			System.out.println("������� num: ");
			int n_delitel = in.nextInt();
			if (num % n_delitel == 0)
			{
				System.out.println("������� ��� �������");
			}
			else
			{
				System.out.println("������� � ��������");
			}
		// 2
		case 2:
		{
			int x = 6;
			switch(x)
			{
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("���");
				break;
			case 3:
				System.out.println("���");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("����");
				break;
			case 6:
				System.out.println("�����");
				break;
			case 7:
				System.out.println("����");
				break;
			case 8:
				System.out.println("������");
				break;
			case 9:
				System.out.println("������");
				break;
			default:
				System.out.println("�� �� �������");
				break;
			}

			break;
		}
		// 3
		case 3:
			System.out.println("������� ����� ������: ");
			int day_week = in.nextInt();
			switch(day_week)
			{
			case 1:
				System.out.println("�����������");
				break;
			case 2:
				System.out.println("�������");
				break;
			case 3:
				System.out.println("�����");
				break;
			case 4:
				System.out.println("�������");
				break;
			case 5:
				System.out.println("�������");
				break;
			case 6:
				System.out.println("�������");
				break;
			case 7:
				System.out.println("�����������");
				break;
			}
		// 4
		case 4:
			System.out.println("������� �������� �������: ");
			String stolica = in.next();
			switch(stolica)
			{
			case "�����":
				System.out.println("��������");
				break;
			case "������":
				System.out.println("������");
				break;
			case "����":
				System.out.println("�������");
				break;
			case "�����":
				System.out.println("������");
				break;
			case "�������":
				System.out.println("������");
				break;
			case "������":
				System.out.println("��������");
				break;
			}
		// 5
		case 5:
			System.out.println("������� n: ");
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
			System.out.println("������� n: ");
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
			System.out.println("������� ��� � ��: ");
			double ves = in.nextDouble();
			System.out.println("������� ���� � ��: ");
			double rost = in.nextDouble();
			double procent = (rost - 100) * 0.1;
			if (ves >= (rost - 100)-procent && (ves <= (rost - 100)+procent))
			{
				System.out.println("��� � �����");
			}
			else
			{
				if (ves < (rost - 100)- procent)
				{
					System.out.println("����� �����������");
				}
				else
				{
					System.out.println("����� ��������");
				}
			}
		}

	}
	
}
class Task5 {
	public void task5() // �� 100-150 ������� ��� ����� �����
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



