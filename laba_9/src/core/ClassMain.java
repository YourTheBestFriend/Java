package core;

import java.util.ArrayList;
import java.util.Random;

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
		
		// ��� �� ��������� 3 ������� �� ������ �����������, � �� ��� � ����� ����� ����������
		//FirstThread.start();
		//SecondThread.start();
		
		// Task 3
		System.out.println("[Task 3]");
		
		ArrayList<Integer> buffer = new ArrayList();
		
		
		/*
		 ���� ��� ������ � ������������� � �����������.
		 ������������� ���������� ��������� ������ (� ������� � �����).
		 ������������� ����������� ��. ��� ������ ��������� ����� ����� ������,
		 ������ �������� ���������. ���� ����� ����, ����������� ������ �����,
		 ���� ��� �������� ������. ���� ����� �������� ���������, �������������	
		 ������ �����, ���� ����������� ������ ������ � ����� �����������.
		 */
		
		Thread myThread_1 = new Thread(new Runnable()
		{
			public void run()
			{
				while(true)
				{
					try 
					{
						Thread.sleep(5000);
						Random rnd = new Random();
						buffer.add(rnd.nextInt(100));
					} 
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}	
			}
		});
		
		Thread myThread_2 = new Thread(new Runnable()
		{
			public void run()
			{
				while(true)
				{
					try 
					{
						Thread.sleep(1000);
						if (!buffer.isEmpty())
						{
							System.out.println("������� ������� �������� ���������: " + buffer.get(0));
							buffer.clear();
						}
						else
						{
							System.out.println("���������� ���� ��� �� ��������");
						}
					} 
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}	
			}
		});
		
		//myThread_1.start();
		//myThread_2.start();
		
	}
}
