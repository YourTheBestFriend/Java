package core;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//import java.io.*;
public class Main {
	public static void main(String[] args) {

		Admin employ1 = new Admin("artem", 1000);
		Admin employ2 = new Admin("david", 1000);
		Admin employ3 = new Admin("boris", 1000);
		Admin employ4 = new Admin("gleb", 1000);
		Admin employ5 = new Admin("vasyliy", 1000);
		
		
		//Developer employ2 = new Developer("artem", 1000.12);
		
		//employ1.display();
//		employ2.display();
//		employ1.srednInMonth();
//		employ2.srednInMonth();
		
		Admin[] array = new Admin[] {employ1, employ2, employ3, employ4, employ5};
		
		// ����� ��� �������� ��� ������� 
		 for (int i = 0; i < array.length; i++)
		 {
			 System.out.println("Admin - name = " + array[i].name + " money = " + array[i].money);
		 }
		 System.out.println("\n");
		 // ������������ �� ��������, ���� ��� ���������� �� ������� �������� �� �� ������ ( � ���������� ������ ��� �� ����������� ����� ��������� ���������� �� ������), � ����� � ������ ������ �� �������� � � ����� � ����� ��� ����� �� � �� ���������� ������� ������� ���� �������))))))))))
		 // String sstr = "��������������������������������";
		 String sstr = "abcdefghijklmnopqrstuvwxyz";
		 char result[] = sstr.toCharArray();
		 for (int i = 0; i < array.length; i++) {
		    for (int j = 1; j < array.length; j++) {
		    	
		    	if ((int)array[j-1].money == (int)array[j].money)
			    {
		    		char first = array[j-1].getName().charAt(0);
		    		char second = array[j].getName().charAt(0);
		    		//System.out.println("iteration " + (j - 1 + " first = " + first + " second = " + second)); // ��� ��������
		    		if (first == second)
		    		{
		    			break;
		    		}
		    		
			    	for(int k = 0; k < sstr.length(); k++)
			    	{
			    		if (second == result[k])
			    		{
			    			Admin b = new Admin(array[j].name, array[j].money); 
					        array[j] = array[j - 1]; //new Admin(array[j - 1].name, array[j - 1].money);
					        array[j - 1] = b;//new Admin(b.name, b.money);
					        break;
			    		}
			    		if (first == result[k])
			    		{
			    			break;
			    		}
			    	}
			    }
			    else
			    {
			    	 if ((int)array[j - 1].money > (int)array[j].money) 
			    	 {
			    		 Admin b = new Admin(array[j].name, array[j].money); 
					     array[j] = new Admin(array[j - 1].name, array[j - 1].money);
					     array[j - 1] = new Admin(b.name, b.money);
					 }
			    }
			    
		    }
		 }
		// ����� ��� �������� ��� ���������� ����� ���������� 
		 for (int i = 0; i < array.length; i++)
		 {
			 System.out.println("Admin - name = " + array[i].name + " money = " + array[i].money); // ������� ��������� �� �������� (a b d g v)
		 }
		 
//		 System.out.println("������ 5: ");
//		 try(FileWriter writer = new FileWriter("test_4.txt", false))
//	        {
//			// ������� ��� ��������
//			 for (int i = 0; i < 5; i++) {
//				 String s = array[i].name + "__" + array[i].money + " index = " + i;
//				  writer.write(s);
//		          writer.append('\n');
//		          writer.flush();
//				 System.out.println(s);
//			 }
//	        }
//	        catch(IOException ex){
//	             
//	            System.out.println(ex.getMessage());
//	        } 
//		 
//		 System.out.println("��������� 3: ");
//		 for (int i = array.length-1; i > array.length-3-1; i--) {
//			 System.out.println(array[i].name + "__" + array[i].money + " index = " + i);
//		 }
//		 
	}
}
