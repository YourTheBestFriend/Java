package core;

public class Employee_for_6_task
{
	private String fullName;
	private double salary;
	
	public Employee_for_6_task() {}
	public Employee_for_6_task(String fullName, double salary) 
	{
		this.fullName = fullName;
		this.salary = salary;
	}
	
	public String getFullName() 
	{
		return fullName;
	}
	
	public void setFullName(String fullName) 
	{
		this.fullName = fullName;
	}
	
	public double getSalary() 
	{
		return this.salary;
	}
	
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	
}
