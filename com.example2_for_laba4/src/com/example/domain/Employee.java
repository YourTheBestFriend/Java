package com.example.domain;

public class Employee {
		private int empId;
		private String name;
		private String ssn;
		private double salary;
		
		public Employee(int empId, String name, String ssn, double salary) {
				this.empId = empId;
				this.name = name;
				this.ssn = ssn;
				this.salary = salary;
		}

		
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
		public void setName(String x)
		{
			name = x;
		}
		// ����� ���������� ��������
		public void raiseSalary(double increase){
			if (increase>0){
				salary += increase;
			}
		}
}