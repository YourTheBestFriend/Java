package core;

public class ClassMain {
	
	static forThread mThing; //mThing - ������ ������, ������������ ��������� Runnable
	
	public static void main(String[] args) 
	{
		
		mThing = new forThread();
		Thread myThready = new Thread(mThing); //�������� ������ "myThready"

		myThready.start(); //������ ������
		System.out.println("������� ����� ��������...");
		//myThready.stop();
	}
}
