package core;

public class forThread 
implements Runnable //(содержащее метод run())
{
		public void run() //Этот метод будет выполняться в побочном потоке
		{
			System.out.println("Привет из побочного потока!");
		}
}
