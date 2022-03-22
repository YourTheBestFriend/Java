package laba_11;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Report_for_6_task
{
	public static void generateReport(Employee_for_6_task[] employees)
	{
		// Change salary
		Locale locale_ = new Locale("ru","RU");
		//Locale locale_ = new Locale("en","US");
		NumberFormat numberFormat1 = NumberFormat.getInstance(locale_);
		
		for (Employee_for_6_task emp : employees)
			System.out.printf(String.format("Полное имя: %s Зарплата: %s\n", emp.getFullName(), numberFormat1.format(emp.getSalary())));
	}
}