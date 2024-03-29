package core;

public class Employee {
	protected String FIO;
	protected int Dolzhnost = 0; // �������� ��������� �� 1 - 5, ��� ����� ������ �� �����
	protected double Oklad;
	public Employee(){}
	public Employee(String FIO, int Dolzhnost, double Oklad)
	{
		this.FIO = FIO;
		this.Dolzhnost = Dolzhnost;
		try
		{
			if (Oklad < 0)
			{
				throw new OkladException("Exception");
			}
			else
			{
				this.Oklad = Oklad;	
			}
				
		}
		catch(OkladException ex)
		{
			System.out.println("����������� ������� ���������� � ������ ������������� �����: " + Oklad + " " + ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	public String getFIO() {
		return FIO;
	}
	public void setFIO(String fIO) {
		FIO = fIO;
	}
	public int getDolzhnost() {
		return Dolzhnost;
	}
	public void setDolzhnost(int dolzhnost) {
		Dolzhnost = dolzhnost;
	}
	public double getOklad() {
		return Oklad;
	}
	public void setOklad(double oklad) {
		Oklad = oklad;
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
			 System.exit(1);
		}
		catch(Exception ex2)
		{
			System.out.println("Exception " + ex2.getMessage());
			 System.exit(1);
		}
		return okl;
	}
}
