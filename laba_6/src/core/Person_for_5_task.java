package core;

public class Person_for_5_task {
	
	private String name;
	private String surname; 
	
	// ����� �������� ����� ���� �������� ��� ��������, ��� �������� �������
	public Person_for_5_task()
	{
		this.name = "default_name";
		this.surname = "default_surname";
	}
	public Person_for_5_task(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
	}
	@Override
	public String toString() { 
		return String.format("Name: %s Surname: %s", this.name, this.surname);
	} 
}
