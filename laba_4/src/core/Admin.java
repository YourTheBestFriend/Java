package core;

public class Admin extends Employee{

	// � �� ��������� ��������� ������
	public Admin(String name, double money) {
		super(name, money);
	}

	@Override
	public void display() {
		System.out.println("Admin - name = " + super.name + " money = " + super.money);
	}

	@Override
	public void srednInMonth() {		
		System.out.println("Admin - Oplata in month = " + 20.8*8*super.money);
	}

}