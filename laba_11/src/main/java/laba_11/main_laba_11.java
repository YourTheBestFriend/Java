package laba_11;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.PropertyResourceBundle;

public class main_laba_11 {
	public static void main(String[] args) 
	{
		// task 1
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
		
		
	}
}
