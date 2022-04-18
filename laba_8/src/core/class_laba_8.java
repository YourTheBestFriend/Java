package core;

import java.io.*;
import java.util.Random;

public class class_laba_8 {
	public static void main(String[] args) 
	{
		System.out.println("laba 8");
		
		// Task 1
		System.out.println("Task 1");
		String text = "name: Goncharov Matvey Nickolaevich\nyearsOld: 17\nsex: M\n"; // �������� ������ ��� ������, ���������� � ����
		try(FileWriter writer = new FileWriter("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\task1.txt"))
	    {	 
			writer.write(text);
	        writer.flush();
	        System.out.println("������ �������� � ����\n");
	        writer.close();
	    }
	    catch(IOException ex)
		{       
	           System.out.println(ex.getMessage());
	    } 
		// ����� �� �����
		try(FilegiveBooks giveBooks = new FilegiveBooks("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\task1.txt"))
        {
           // ������ �����������
            int c;
            while((c=giveBooks.read())!=-1){
                 
                System.out.print((char)c);
            } 
            System.out.println("�� ������� ��������� ������ �� �����\n");
            giveBooks.close();
        }
        catch(IOException ex)
		{
            System.out.println(ex.getMessage());
        } 
		File fileobj = new File("C:\\Users\\Matthew\\Desktop\\Java\\laba_8\\src\\core\\task1.txt");
		System.out.println("����� ���������� � �����:");
		System.out.println("Name of file:" + fileobj.getName());
		System.out.println("Size of file:" + fileobj.length() + " Bytes");
		System.out.println("Last modified:" + fileobj. lastModified());
		System.out.println("Parent:" + fileobj.getParent());
		System.out.println("Path:" + fileobj.getPath());
		System.out.println("Abs Path:" + fileobj.getAbsolutePath());
		System.out.println("File " + (fileobj.exists() ? "exists" : " not exist"));
		System.out.println(fileobj.canRead() ? "can read" : "can�t read");
		System.out.println(fileobj.canWrite() ? "can write" : "can�t write");
		System.out.println("This is " + (fileobj.isDirectory() ? " " : "not") + " directory");
		System.out.println("This is "+ (fileobj.isAbsolute() ? "absolute" : " not absolute") +
		(fileobj.isFile() ? " normal file" : " a named pipe"));
		
		// task 2
		System.out.println("\nTask 2");
		int[] arr_10 = new int[10];
		int sredn_in_arr = 0;
		try(FilegiveBooks giveBooks2 = new FilegiveBooks("C:\\Users\\Matthew\\Desktop\\Java\\laba_8\\src\\core\\f.txt"))
        {
			int i = 0;
			while (true)
			{
				// ��� ������� ������ � �������
				char c = (char) giveBooks2.read();
				int num =  c - '0';
				if (num != -16) // -16 ��� ������
				{
					arr_10[i] = num;
					sredn_in_arr += arr_10[i];
					System.out.print(arr_10[i] + " ");
					i++;
				}
				if (i == arr_10.length)
				{
					break;
				}
			}
			sredn_in_arr /= arr_10.length;
			System.out.print("\n������� �� �����: " + sredn_in_arr);
			giveBooks2.close();
        }
        catch(IOException ex)
		{
            System.out.println(ex.getMessage());
        } 
		
		// task 3
		System.out.println("\n\nTask 3"); // import java.util.Random;
		Random rand = new Random();
		int int_random = rand.nextInt(10); 
		int colvo_randomn = 20;
		try(FileWriter writer = new FileWriter("C:\\Users\\Matthew\\Desktop\\Java\\laba_8\\src\\core\\f_4.txt", false))
	    {	 
			for (int i = 0; i < colvo_randomn;i++)
			{
				int_random = rand.nextInt(100); 
				System.out.print(int_random + " ");
				writer.write(Integer.toString(int_random) + " "); // �������� ����������� ��� ������
			}
	        writer.flush();
	        System.out.println("\n������ �������� � ����\n");
	        writer.close();
	    }
	    catch(IOException ex)
		{       
	           System.out.println(ex.getMessage());
	    }
		
		// ������ ���� �������� � ��������� � ������ ����, .... �������� � ���� g ��� ������ ����� ����� �� f, � � ���� h � ��� ��������.
		String[] arr_string;
		try(FilegiveBooks giveBooks2 = new FilegiveBooks("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\f_4.txt"))
        {
			 BufferedgiveBooks giveBooks = new BufferedgiveBooks(giveBooks2);
	         String line;
	         while (true) 
	         {
	        	 // System.out.println(line);// ��� ��������
	             // ��������� ��������� ������ � �����
	             line = giveBooks.readLine(); // ��� � ������ ������ ����� �� �������� �� ������ � ��������� � ����� g � h
	             if (line == null) // ����� ��� �������� �� ����� ���� � ������
	             {
	            	 break;
	             }
	             // ������ �� ������ �� ��������, ������ ����� �������� �� ���  
	             arr_string = line.split(" ");
	            
	             
	             // � ���� ���� ��������� ������
	             try(FileWriter writer_g = new FileWriter("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\g__.txt"))
	             {
	            	 for (int i = 0; i < arr_string.length; i++)
		             {
		            	 if (Integer.parseInt(arr_string[i]) % 2 == 0)
		            	 {
		            		 // System.out.println("_______" + Integer.parseInt(arr_string[i])); // ��� ��������
		            		 writer_g.write(arr_string[i] + " "); // ��������� ����� ������
		            	 }
		             }
	            	 writer_g.close();
	             }
	             catch(IOException ex)
	     		 {       
	            	 System.out.println(ex.getMessage());
	     	     }
	             
	             // � ���� ���� ��������� �� ������
	             try(FileWriter writer_h = new FileWriter("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\h__.txt"))
	             {
	            	 for (int i = 0; i < arr_string.length; i++)
		             {
	            		 if (Integer.parseInt(arr_string[i]) % 2 != 0)
		            	 {
	            			// System.out.println("_______" + Integer.parseInt(arr_string[i])); // ��� ��������
		            		 writer_h.write(arr_string[i] + " "); // ��������� ����� ������
		            	 }
		             }
	            	 writer_h.close();
	             }
	             catch(IOException ex)
	     		 {       
	            	 System.out.println(ex.getMessage());
	     	     }
	         }

            System.out.println("�� ������� ��������� ������ �� �����\n");
            giveBooks2.close();
        }
        catch(IOException ex)
		{
            System.out.println(ex.getMessage());
        } 
		
		// task 4
		System.out.println("\nTask 4"); 
		String[] arr_string_2;
		double sredn_temp = 0;
		try(FilegiveBooks giveBooks4 = new FilegiveBooks("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\temp.dat"))
        {
			 BufferedgiveBooks giveBooks_2 = new BufferedgiveBooks(giveBooks4);
	         String line;
	         while (true) 
	         {
	        	 // System.out.println(line);// ��� ��������
	             // ��������� ��������� ������ � �����
	             line = giveBooks_2.readLine(); // ��� � ������ ������ ����� �� �������� �� ������ � ��������� � ����� g � h
	             if (line == null) // ����� ��� �������� �� ����� ���� � ������
	             {
	            	 break;
	             }
	             // ������ �� ������ �� ��������, ������ ����� �������� �� ���  
	             arr_string_2 = line.split(" ");
	             for (int i = 0; i < arr_string_2.length; i++)
	             {
	            	 sredn_temp += Double.parseDouble(arr_string_2[i]);
	             }
	             sredn_temp /= arr_string_2.length;
	             System.out.println("������� ����������� �� ������ = " + sredn_temp);
	             sredn_temp = 0; // ������� �.� ����� ������ �� ������ � ���� ������
	         }
        }
		catch(IOException ex)
		{
            System.out.println(ex.getMessage());
        } 
		
		// task 5
		// � ����������� ������� ���������� - ���� ���� �� ������ � ��� �� ������� ����� ����� ��������� � �������� � �.�
		System.out.println("\nTask 5"); 
		// ��� �������� �������� ����� � ����� ���� �������� � ���� 
		try(FileWriter writer2 = new FileWriter("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\h_task5.txt"))
        {
			try(FilegiveBooks giveBooks2 = new FilegiveBooks("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\f_task5.txt"))
	        {
				BufferedgiveBooks giveBooks = new BufferedgiveBooks(giveBooks2);
		         String line;
		         int line_polozh_elem = 0, index_line_polozh_elem = 0;
		         while (true) 
		         {
		             line = giveBooks.readLine();
		             if (line == null) // ����� ��� �������� �� ����� ���� � ������
		             {
		            	 break;
		             }
		             writer2.write(line); 
		         }
				giveBooks2.close();
	        }
	        catch(IOException ex)
			{
	            System.out.println(ex.getMessage());
	        } 
			writer2.write(" "); 
			try(FilegiveBooks giveBooks2 = new FilegiveBooks("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\g_task5.txt"))
	        {
				BufferedgiveBooks giveBooks = new BufferedgiveBooks(giveBooks2);
		         String line;
		         int line_polozh_elem = 0, index_line_polozh_elem = 0;
		         while (true) 
		         {
		             line = giveBooks.readLine();
		             if (line == null) // ����� ��� �������� �� ����� ���� � ������
		             {
		            	 break;
		             }
		             writer2.write(line); 
		         }
				giveBooks2.close();
	        }
	        catch(IOException ex)
			{
	            System.out.println(ex.getMessage());
	        } 
			writer2.close();
        }
        catch(IOException ex)
		{
            System.out.println(ex.getMessage());
        } 
		System.out.println("������� ���� - h_task5.txt");
		
		// task 6
		System.out.println("\nTask 6"); 
		// ������� 10 ����� � ���� f_task6.txt
		// �������� �� ����� � ������ 
		String str_pol_otr = "1 2 -3 4 5 -6 -7 8 9 10";
		try(FileWriter writer2 = new FileWriter("C:\\\\Users\\\\Matthew\\\\Desktop\\\\Java\\\\laba_8\\\\src\\\\core\\\\f_task6.txt"))
        {
			writer2.write(str_pol_otr);
			writer2.close();
        }
        catch(IOException ex)
		{
            System.out.println(ex.getMessage());
        } 
		
		int[] arr_10_for_find_polozh_znach = new int[10];
		
		try(FilegiveBooks giveBooks2 = new FilegiveBooks("C:\\Users\\Matthew\\Desktop\\Java\\laba_8\\src\\core\\f_task6.txt"))
        {
			BufferedgiveBooks giveBooks = new BufferedgiveBooks(giveBooks2);
	         String line;
	         int line_polozh_elem = 0, index_line_polozh_elem = 0;
	         while (true) 
	         {
	        	 // System.out.println(line);// ��� ��������
	             // ��������� ��������� ������ � �����
	             line = giveBooks.readLine();
	             if (line == null) // ����� ��� �������� �� ����� ���� � ������
	             {
	            	 break;
	             }
	             // ������ �� ������ �� ��������, ������ ����� �������� �� ���  
	             arr_string = line.split(" ");
	             for (int i = 0; i < arr_string.length; i++)
	             {
            		 if (Integer.parseInt(arr_string[i]) > 0)
	            	 {
            			 line_polozh_elem++;
	            	 }
	             }
	             System.out.println("� ������ �� ������� " + index_line_polozh_elem + " ���-�� ������������� ��������� = " + line_polozh_elem);
	             line_polozh_elem = 0; // ������� �.� � ���� ������ ���� ���-�� ������������� ���������
	         }
			giveBooks2.close();
        }
        catch(IOException ex)
		{
            System.out.println(ex.getMessage());
        }
	}
}
