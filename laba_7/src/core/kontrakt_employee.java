package core;

public class kontrakt_employee extends Employee {

	public kontrakt_employee()
	{
		super();
	}
	public kontrakt_employee(String FIO, int Dolzhnost, double Oklad)
	{
		super(FIO, Dolzhnost, Oklad);
	}
	public double return_zarplatu()
	{
		System.out.println("����� ���������� - " + getOklad());
		int doklad =  getDolzhnost();
		System.out.println("��������� - " + doklad + " �������� ������������� �� " + (10* doklad) + "%");
		System.out.println("��������� - " + doklad + " �������� ������������� �� " + (10 * doklad) + "%");
		double okl = 0;
		try
		{
			// ��������� ���������� �.� Dolzhnost = 0 �������� ���� ������� ������
			// this.setDolzhnost(5); // ������������ ����� �� ���� ����������
			 okl = Oklad + (Oklad * (doklad * 10) / 100); // + ���������� ������ �� ���������
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception " + ex.getMessage());
		}
		catch(Exception ex2)
		{
			System.out.println("Exception " + ex2.getMessage());
		}
		return okl;
	}
}
