package core;

public class state_employee extends Employee{
	private double Premia;

	public state_employee()
	{
		super();
	}
	public state_employee(String FIO, int Dolzhnost, double Oklad,double Premia)
	{
		super(FIO, Dolzhnost, Oklad);
		this.Premia = Premia;
	}
	public double getPremia() {
		return Premia;
	}

	public void setPremia(double premia) {
		Premia = premia;
	}
	public double return_zarplatu()
	{
		System.out.println("����� ���������� - " + getOklad());
		int doklad =  getDolzhnost(); // doklad - �� �����
		double okl = 0;
		try
		{
			if (getOklad() < 1)
			{
				throw new PremiyaException("��� ����� < 0"); // ������ ����������
			}
			else
			{
				if (getPremia() < 0)
				{
					throw new PremiyaException("���� ������ < 0"); // ������ ����������
				}
				else
				{
					System.out.println("��������� - " + doklad + " �������� ������������� �� " + (10* doklad) + "%");
					System.out.println("������ ���������� = " + getPremia());
					okl = Oklad + (Oklad * (doklad * 10) / 100) + getPremia(); // + ���������� ������ �� ���������
				}
			}	
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception " + ex.getMessage());
			ex.printStackTrace();
			 System.exit(1);
		}
		catch(PremiyaException ex2)
		{
			System.out.println("Exception " + ex2.getMessage());
			ex2.printStackTrace();
			 System.exit(1);
		}
		return okl;
	}
}
