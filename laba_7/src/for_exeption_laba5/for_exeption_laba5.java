package for_exeption_laba5;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; // ���������� ���� import java.util.Scanner;


// �.� ��� ��� � ����� ������ �� �� ���� ��������� �� /// ��� ������ ����� ������� laba5 + ���������� ���������� �� �������
///////////////////////////////////////// �������� ���������� ���������� �� 2 �������, ��������� ������� �������
////////////////////////////////////////////////////////////////////////////////////////////////////


public class for_exeption_laba5 {	
	// for 2 task
	public static void SortStudent(ArrayList<Student> listStudent)
	{
		// ������� ������ ������� ���� 
		
		int sredn = 0;
		for (int i = 0; i < listStudent.size(); i++)
		{
			sredn = 0; // ������� ��� ������� ��������
			for (int j = 0; j < listStudent.get(i).marks.size(); j++) // listStudent.get(i).marks.size()  �������� ������ ������ ������� � ������� ��������
			{
				sredn += listStudent.get(i).marks.get(j);
			}
			// ��������
			try 
			{
				sredn /= listStudent.get(i).marks.size();
				//sredn /= 0; // ����� ��� �������� ���������, ������� ���� �� ���� ���� ���� ������ ������
			}
			catch(ArithmeticException ex)
			{
				System.out.println("EXCEPTION 4: " + ex.getMessage());
			}
			
			if (sredn < 3)
			{
				listStudent.remove(i);
			}
			else
			{
				// ������ ������ ��� ����� 3 // >=3
				if (listStudent.get(i).getNumKursa() < 4) // �������� ����� ��� ���������� �� 5 ���� ���� �������� ����� 4
				{
					listStudent.get(i).setNumKursa(listStudent.get(i).getNumKursa()+1);
				}	
			}
		}			
	}
	
	// task 2.2
	public static void printStudentInList_vibor_pocursu(ArrayList<Student> listStudent, int numCourse)
	{
		for (int i = 0; i < listStudent.size(); i++)
		{
			if (listStudent.get(i).getNumKursa() == numCourse) // ���� ���������
			{
				System.out.println("Student name: " + listStudent.get(i).getName());
			}
		}
	}
	
	// main
	public static void main(String[] args) throws Exception{
		
		//////////////////////////////////// 2
		System.out.println("\nTask 2");
		// ������ ���������
		ArrayList<Student> listStudent = new ArrayList<Student>(2); // ����� ���� ������ 2 ��������, �� ���������� �������� ����������
		
		// ��� ����� 
		Scanner in = new Scanner(System.in);
		
		// ������ ������� � ��� ������
		ArrayList<Integer> listMarksMatvey = new ArrayList<Integer>();
		// {9, 8, 9, 10};
		// ���������� ����� ��������� ������� �������� �� ����
//		listMarksMatvey.add(9);
//		listMarksMatvey.add(8);
//		listMarksMatvey.add(9);
//		listMarksMatvey.add(10);
		
		// ������ ������� � ��� ������
		ArrayList<Integer> listMarksNikita = new ArrayList<Integer>();
		// {3, 2, 1, 2};
//		listMarksNikita.add(3);
//		listMarksNikita.add(2);
//		listMarksNikita.add(1);
//		listMarksNikita.add(2);
				
		
		// ������ ������� � ��� ������
		ArrayList<Integer> listMarksPeta = new ArrayList<Integer>();
		// {10, 5, 8, 9};
//		listMarksPeta.add(10);
//		listMarksPeta.add(5);
//		listMarksPeta.add(8);
//		listMarksPeta.add(9);
		
		
		// ��� �������� �� ���� �������� ������
		try
		{
			///// import java.util.Scanner; // ���������� ���� import java.util.Scanner;
			int mark;
			for(int i = 0; i < 4; i++)
			{
				System.out.print("������� ����� (������ ��� ������): ");
				mark = in.nextInt();
				
				// �������� ���� ������ �������������, � ����� �� ����� ���� �� � ������ ���� ����������
				if (mark < 0)
				{
					throw new Exception("EXCEPTION 1: �� ����� ������������� ����� ������"); // ��� �������� ������ � ���� �� ������ ������������� ��������
				}
				
				listMarksMatvey.add(mark); // ������ ������
				
				System.out.print("������� ����� (������ ��� ������): ");
				mark = in.nextInt();
				if (mark < 0)
				{
					throw new Exception("EXCEPTION 1: �� ����� ������������� ����� ������");
				}
				
				listMarksNikita.add(mark);
				System.out.print("������� ����� (������ ��� ����): ");
				mark = in.nextInt();
				if (mark < 0)
				{
					throw new Exception("EXCEPTION 1: �� ����� ������������� ����� ����");
				}
				
				listMarksPeta.add(mark);
			}
		}
		catch(InputMismatchException ex) // �������� �������� ����� ������� ������ ������������ ��� �������
		{
			System.out.println("�� �� ������ ��������� ������:\nEXCEPTION 2: " + ex.getMessage());
		}
		
		Student st1 = new Student("Matvey", 992, 3, listMarksMatvey); // ������ ������ �������� ������ �� ������� ������
		Student st2 = new Student("Nikita", 992, 3, listMarksNikita);
		Student st3 = new Student("Peta", 992, 3, listMarksPeta);
		
		// �������� ����� ��������� �� �� �������� �.� ������� ��������� ������ ���� ���������. � ����������� ����� 2
		try
		{
			listStudent.add(st1);
			listStudent.add(st2);
			listStudent.add(st3);	
		}
		catch(ArrayIndexOutOfBoundsException ex) // �� ������� ������-�� ����������
		{
			System.out.println("EXEPTION 3" + ex.getMessage());
		}
		
		// ���� �������
		SortStudent(listStudent);
		printStudentInList_vibor_pocursu(listStudent, 3); // ������ �� ����������� �.� �� ��������� �� next ����, ����������� Peta (��� ���� �������� �� �� ������ ������� ������ �����) // ��� ��� // {9, 8, 9, 10}; // {3, 2, 1, 2}; // {10, 5, 8, 9};	
	}
}
