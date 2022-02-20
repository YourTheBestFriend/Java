package core;

public class ClassMain {
	
	static forThread mThing; //mThing - ������ ������, ������������ ��������� Runnable
	
	public static void main(String[] args) 
	{
		// Task 1
		System.out.println("[Task 1]");
		mThing = new forThread();
		Thread myThready = new Thread(mThing); //�������� ������ "myThready"
		
		System.out.println("��� message 1 - ����� �������� ������");
		System.out.println(myThready.getState());
		myThready.start(); //�������� �����
		System.out.println("��� message 2 - ����� ������� ������");
		System.out.println(myThready.getState());
		
		// Task 2
		System.out.println("[Task 2]");
		Thread FirstThread = new Thread(new Runnable()
		{
			public void run()
			{
				while(true)
				{
					try 
					{
						System.out.println("Name: FirstThread; Id [" + Thread.currentThread().getId() + "]");
						Thread.sleep(2000);
					} 
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}	
			}
		});
		
		Thread SecondThread = new Thread(new Runnable()
		{
			public void run()
			{
				while(true)
				{
					try 
					{
						System.out.println("Name: SecondThread; Id [" + Thread.currentThread().getId() + "]");
						Thread.sleep(2100);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		FirstThread.start();
		SecondThread.start();
		
		
	}
}