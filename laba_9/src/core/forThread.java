package core;

public class forThread 
implements Runnable //(���������� ����� run())
{
		public void run() //���� ����� ����� ����������� � �������� ������
		{
			System.out.println("��� message 3 - (�� ����� ����������) ������ �� ��������� ������!");
			System.out.println(Thread.currentThread().getState()); // ����� ��������� �������� ������
		}
}
