package core;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.Scanner;

public class class_laba_6 {
	
	// 3 
	public static String return_two_char_on_center(String s)
	{
		String s_2 = "";
		int sered = (int)(s.length() - 1) / 2;
		s_2 += s.charAt(sered);
		// ���� �� ������ � ��� 1 ������ � ��������
		if (s.length() % 2 == 0)
		{
			s_2 += s.charAt(sered+1);
		}
		return s_2;
	}
	
	// 7
	public static void print_Java_X(String str)
	{	
		String pStr = "Java\\s+\\d{1,2}";
		Pattern p = Pattern.compile(pStr);
		Matcher m = p.matcher(str);
		while (m.find())
		{
			System.out.println(m.group());
		}
	}
	
	// 9 
	public static int count_eng_word(String str)
	{
		int flag = 0;
		String[] arr_str = str.split(" "); // ������ �� ��������
		for(int i = 0; i < arr_str.length; i++)
		{
			if (arr_str[i].matches("[a-zA-z]+")) // ������������ �� eng �����
			{
				flag++;
			}
		}
		return flag;
	}
	
	// 10.1
	public static boolean is_palindrome(int x) 
	{
		char[] s = Integer.toString(x).toCharArray();
		for (int i = 0, i_end = s.length - 1; i < (int)(s.length-1) / 2; i++, i_end--)
		{
			if (s[i] != s[i_end])
			{
				return false;
			}
		}
		return true;
		
	}
	
	// 10.2
	public static ArrayList<Integer> find_palindromes(String x) // ����� �����
	{
		String[] words = x.split(" ");
		ArrayList<Integer> palindromes = new ArrayList<Integer>(); // ���� ������
		for(int i = 0; i < words.length; i++)
		{
			if (words[i].matches("[0-9]+")) // �������� �� ��������� ( + ��� �� 1 � ������ ��������� ���� ��� �����)
			{
				int x_znach = Integer.parseInt(words[i].trim()); // ��������� ������ ����� 
				if (is_palindrome(x_znach)) // �������� ��� �� ���������
				{
					palindromes.add(x_znach);
				}
			}
		}
		return palindromes;
	}
	
	public static void main(String[] args) {

		// ���������� ���� import java.util.Scanner;
		Scanner in = new Scanner(System.in);
		
		// � 
		System.out.println("\nTask 1");
		//System.out.println("������� ������: (������� � ������� �������)"); /// ����� ������ ��� �� �������
		//String str = in.nextLine();
		
		/*
		// �
		System.out.println(str.charAt(str.length()-1));
		
		// � 
		System.out.println(str.endsWith("!!!") ? true:false);
		
		// �
		System.out.println(str.startsWith("I like") ? true : false);
	
		// �
		System.out.println(str.contains("Java") ? true : false);
		*/
		
		// e
		String str = "I love Java!";
		System.out.println(str.indexOf("Java")); // I love Java! -- 7
		
		// �
		//System.out.println(str.replace('a', 'o'));
		
		
		// 2
		System.out.println("\nTask 2");
		
		// �������� ������
		String str2 = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
		
		/*
		 *
		 "Object-oriented programming is
		  a programming language model organized around objects rather than "actions"
	      and data rather than logic. OOP blabla. Object-oriented programming bla."
		
		��� ��� ���� � ����� ����� ��� ����� ��������
		
		String[] arr_str2 = str2.split(".");
		for	(int i = 0; i < arr_str2.length; i++) // ������� � 1 �.� ��� ����� ������ ���������
		{
			System.out.println(arr_str2[i]);
		}
		str2 = "";
		for	(int i = 1; i < arr_str2.length; i++) // ������� � 1 �.� ��� ����� ������ ���������
		{
			if(i % 2 != 0)
			{
				arr_str2[i] = arr_str2[i].replace("Object-oriented programming", "OOP");
			}
			str2 += arr_str2[i];
		}
		*/
		
		System.out.println(str2.replaceFirst(" Object-oriented programming"," OOP"));
		
		
		// 3
		System.out.println("\nTask 3");
		String str_1 = "string";
		String str_2 = "code";
		String str_3 = "Practice";
		
		System.out.println(return_two_char_on_center(str_1));
		System.out.println(return_two_char_on_center(str_2));
		System.out.println(return_two_char_on_center(str_3));
			
		// 4
		System.out.println("\nTask 4");
		String name = "Matvey";
		int mark = 10;
		String predmet = "Java";
		System.out.println(String.format("������� %15s ������� %3d �� %10s", name, mark, predmet));
		
		// 5
		System.out.println("\nTask 5");
		Person_for_5_task p1 = new Person_for_5_task(); // ��� �� ������� ������ �������� ��� �����
		System.out.println(p1); // ��������� ����� toString()
		
		// 6
		System.out.println("\nTask 6");
		Employee_for_6_task[] emp1 = new Employee_for_6_task[] { new Employee_for_6_task("fullname1",557.10), new Employee_for_6_task("fullname2",725.20), new Employee_for_6_task("fullname3",345.56)}; // ��������
		Report_for_6_task.generateReport(emp1);	
		
		// 7
		System.out.println("\nTask 7");
		String str7 = "Versions: Java 5, _Java X, Java 6, Java 7, Java 8, Java 12.";
		print_Java_X(str7);
		
		// 8
		System.out.println("\nTask 8");
		String str8 = "fffff ab f 1234 jkjk";
		String[] words = str8.split(" ");
		
		/*
		 ����� distinct ���������� stream ��� ����������, ��� ���� ��� �������������� ������ (��������, ��������� �� ������ list) ������� ��������, ��� ���������������� � ������� �� �������������
		 */
		int wordIndex = (int)words[0].chars().distinct().count(); // ������ ������� ����� � ���-��� �������� �� ������������� ��������
		String word = words[wordIndex];
		for(int i = 0; i < words.length; i++)
		{
			if (words[i].chars().distinct().count() < words[wordIndex].chars().distinct().count())
			{
				wordIndex = i;
				word = words[wordIndex];
			}
		}
		System.out.println(words[wordIndex]);
		
		// 9
		System.out.println("\nTask 9");
		String str9 = "One two three ��� ��� ��� one1 two2 123 ";
		System.out.println("���-�� ������ eng ����: " + count_eng_word(str9));
		
		// 10
		System.out.println("\nTask 10");
		String str10 = "asdfasd a 123321 sdfa 1551 dsf 3436 234asdfasdfasdf";
		for ( int i : find_palindromes(str10))
			System.out.println(i);
		
	}
}
