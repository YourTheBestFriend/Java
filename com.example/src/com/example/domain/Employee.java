package com.example.domain;

public class Employee {
		public int empId;
		public String name;
		public String ssn;
		public double salary;
		
		// Конструктор без параметров 
		public Employee() {}
		
		// get 
		public int getEmpId()
		{
			return empId;
		}
		public String getName()
		{
			return name;
		}
		public String getSsn()
		{
			return ssn;
		}
		public double getSalary()
		{
			return salary;
		}
		
		// set 
		public void setEmpId(int x)
		{
			empId = x;
		}
		public void setName(String x)
		{
			name = x;
		}
		public void setSsn(String x)
		{
			ssn = x;
		}
		public void setSalary(double x)
		{
			salary = x;
		}	
}
