package core;

public class ClassMain {
	
	static forThread mThing; //mThing - объект класса, реализующего интерфейс Runnable
	
	public static void main(String[] args) 
	{
		// Task 1
		System.out.println("[Task 1]");
		mThing = new forThread();
		Thread myThready = new Thread(mThing); //Создание потока "myThready"
		
		System.out.println("Это message 1 - Перед запуском потока");
		System.out.println(myThready.getState());
		myThready.start(); //Запускаю поток
		System.out.println("Это message 2 - После запуска потока");
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
		
		// Что бы тестануть 3 задание не забыть закоментить, а то там в цикле кручу бесканечно
		FirstThread.start();
		SecondThread.start();
		
		// Task 3
		System.out.println("[Task 3]");
		
		int buffer;
		boolean empty_or_not = true;
		
		/*
		 Дано два потока — производитель и потребитель.
		 Производитель генерирует некоторые данные (в примере — числа).
		 Производитель «потребляет» их. Два потока разделяют общий буфер данных,
		 размер которого ограничен. Если буфер пуст, потребитель должен ждать,
		 пока там появятся данные. Если буфер заполнен полностью, производитель	
		 должен ждать, пока потребитель заберёт данные и место освободится.
		 */
		
		
		
		
	}
}
