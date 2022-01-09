package core;

public class Report_for_6_task
{
	public static void generateReport(Employee_for_6_task[] employees)
	{
		for (Employee_for_6_task emp : employees)
			System.out.printf(String.format("FullName: %s Зарплата: %5.2f\n", emp.getFullName(), emp.getSalary()));
	}
}