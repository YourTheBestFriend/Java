package laba_11;

import java.util.ResourceBundle;

import java.util.Locale;
import java.util.PropertyResourceBundle;

public class main_laba_11 {
	public static void main(String[] args) 
	{
		// task 1
		System.out.println("Task 1");
		ResourceBundle bundleDefault = ResourceBundle.getBundle("resurses"); // Возьмет по дефолту, а по дефолту русский стоит
		ResourceBundle bundle_en = ResourceBundle.getBundle("resurses", new Locale("en","US"));
		
		// печатаю значение по ключам
		for (var x : bundleDefault.keySet())
		{
			System.out.println(bundleDefault.getString(x));
		}
		for (var x : bundleDefault.keySet())
		{
			System.out.println(bundle_en.getString(x));
		}
		
		// task 2
		System.out.println("\nTask 2");
		Employee_for_6_task[] emp1 = new Employee_for_6_task[] { new Employee_for_6_task("fullname1",557.10), new Employee_for_6_task("fullname2",725.20), new Employee_for_6_task("fullname3",345.56)}; // Заполнил
		Report_for_6_task.generateReport(emp1);	
		
	}
}
