package core;

public class forThread 
implements Runnable //(содержащее метод run())
{
		public void run() //Ётот метод будет выполн€тьс€ в побочном потоке
		{
			System.out.println("Ёто message 3 - (¬о врем€ выполнени€) ѕривет из побочного потока!");
			System.out.println(Thread.currentThread().getState()); // ¬ывод состо€ни€ текущего потока
		}
}
