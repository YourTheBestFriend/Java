package core;

public class class_laba7 {
	
	// (��� ����) throws � ������������ � ��������� ������� ��� ��������������, � ��� ��� ����� ����� ��������� ����������.
	public static void main(String[] args) throws Exception {
		
		// ��� �������� -500, ��� �������� �� ����������
		state_employee employee1 = new state_employee("GoncharovMatveyNicholaevich", 5, 500, 100);
		
		// ��� �������� �� ����� �������� � ������ ���������� � ������ state_employee - ����� return_zarplatu ������� ������� � ��� ����� ��������� ����������
		// ��� ����� ��� ������ ������� �������������
		// employee1.setPremia(-23.5);
		System.out.println("�������� ��������: " + employee1.return_zarplatu());		
	}
}
