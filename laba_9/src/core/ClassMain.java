package core;

public class ClassMain {
	
	static forThread mThing; //mThing - объект класса, реализующего интерфейс Runnable
	
	public static void main(String[] args) 
	{
		
		mThing = new forThread();
		Thread myThready = new Thread(mThing); //Создание потока "myThready"

		myThready.start(); //Запуск потока
		System.out.println("Главный поток завершён...");
		//myThready.stop();
	}
}
