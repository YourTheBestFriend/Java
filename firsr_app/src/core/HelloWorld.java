package core;
// ��� ����������� �����
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
		// ���������� ���� import java.util.Scanner;
		Scanner in = new Scanner(System.in);
		// next() - ��������� ��������� ������ �� ������� �������
		// nextLine() - ��������� ��� ��������� ������
		// nextInt() - ��������� ��������� ����� int
		// nextDouble() - ��������� ��������� ����� double
		// hasNext() - ���������, ���� �� ������� �����
		// hasNextInt() - ���������, ���� �� ������� ����� int
		// hasNextDouble - ���������, ���� �� ������� ����� double
		/* �� �������� - nextByte(), nextShort(), nextFloat(), nextBoolean()*/
		System.out.println("������� �����: ");
		int h = in.nextInt();
		System.out.println(h);
		
		System.out.println("������� ������: (������� � ������� �������)");
		String str = in.next();
		System.out.println(str);
		
//		System.out.println("������� ������: ");
//		String str2 = in.nextLine();
//		System.out.println(str2);
		
		// ������ � ���������
		int[] array = new int[] {1,2,3,4,5};
		int array2[] = new int[] {1,2,3,4,5}; // ���� �����
		int[] array3 = {1,2,3,4,5};
		// ������������ �������� � ������
		int arr_point[] = new int[2];
		arr_point[0] = 3;
		arr_point[1] = 6;
		// ����� �������
		int len = arr_point.length;
		// ��������� ������ �������� = length-1
		
		// ��������� 
		int[][] double_array = { { 0, 1, 2 }, { 3, 4, 5 } };
		
		// �������� ������
		int[][] teeth_arr = new int[3][];
		teeth_arr[0] = new int[2];
		teeth_arr[1] = new int[3];
		teeth_arr[2] = new int[5];
		
		/*
		 foreach
		����������� ������ ����� for ������������� ��� �������� ��������� � ������� ���������, 
		��������, � �������� � ����������. ��� ���������� �������� ����� foreach , 
		������� ������� � ������ ������ ����������������. ���������� �� ����������:
		
		for (���_������ ��������_���������� : ���������){
    	// ��������
		}	
		 */
		int[] array12 = new int[] { 1, 2, 3, 4, 5 };
		for (int k : array12){
		             
		    System.out.println(k);
		}
		
		/*
		 � �������� ���������� � ������ ������ ��������� ������ ������ ���� int.
		 ����� ����������� ���������� � ����� int
		 �� �� ����� ����� ���� �� ������� � � ������� ������� ������ for:
		 
		 int[] array = new int[] { 1, 2, 3, 4, 5 };
		 for (int i = 0; i < array.length; i++){
    	 	System.out.println(array[i]);
	 	 }
		 
		 � �� �� ����� ��� ������ ����� for ����� ������ �� ��������� for (int i : array). 
		 � ���������, � ���� ������ �� ����� �������� ��������:
		 
		 int[] array = new int[] { 1, 2, 3, 4, 5 };
		 for (int i=0; i<array.length;i++){
    		array[i] = array[i] * 2;
    		System.out.println(array[i]);
		 }
		 */
		
		// ������� ����������� �������� � �����
		
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
