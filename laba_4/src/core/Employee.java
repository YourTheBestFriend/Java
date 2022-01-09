package core;

public abstract class Employee {
	String name;
	double money;
	Employee(String name, double money){
		this.name = name;
		this.money = money;
	}
	public String getName() { return name; }
	public abstract void display();
	public abstract void srednInMonth();
}