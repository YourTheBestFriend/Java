package core;


public class Developer extends Employee{

	// У него будет фиксированная оплата
	public Developer(String name, double money) {
		super(name, money);
	}

	@Override
	public void display() {
		System.out.println("Developer - name = " + super.name + " money = " + super.money);
		
	}

	@Override
	public void srednInMonth() {
		System.out.println("Admin - Oplata in month = " + super.money);
	}

}
