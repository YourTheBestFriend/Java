///////////////////////// Предположительно что в правую руку не попадает то нико и не кушает, нужно найти в чем причина ++ РЕШЕНО


package core;
import java.util.ArrayList;
////////////////////////////////////////////// Например ID потока будет ID философа - Thread.currentThread().getId()
import java.util.Random;


class Philosopher implements Runnable{
    private boolean left_hand, right_hand;
    public boolean isRight_hand() {
		return right_hand;
	}
	public void setRight_hand(boolean right_hand) {
		this.right_hand = right_hand;
	}
	// Совойства
    public boolean isLeft_hand() {
		return left_hand;
	}
	public void setLeft_hand(boolean left_hand) {
		this.left_hand = left_hand;
	}
	public Philosopher(boolean left_hand, boolean right_hand)
    {
        this.left_hand = left_hand;
        this.right_hand = right_hand;
    }
 @Override
 public void run(){
     try 
     {
    	do
    	{
    		// Рандомное время ожидания
    		Random rnd = new Random();
    		Thread.sleep(rnd.nextInt(4000));
            if (left_hand == true && right_hand == true) // Две вилки в руках
            {
           	 // Например тут по ID можно посчитать какой конкретно философ и сколько раз кушал. Через флаг.
           	 System.out.println("Философ ID = " + Thread.currentThread().getId() + " Кушает спагетти");
            }
            else if (left_hand == false && right_hand == false)  // Ноль вилок в руках
            {
           	 System.out.println("Философ ID = " + Thread.currentThread().getId() + " Думает");
            }
            else if (left_hand == true && right_hand == false)  // Вилка в левой руке
            {
           	 System.out.println("Философ ID = " + Thread.currentThread().getId() + " Держит вилку в левой руке");
            }
            else if (left_hand == false && right_hand == true)  // Вилка в левой руке
            {
           	 System.out.println("Философ ID = " + Thread.currentThread().getId() + " Держит вилку в правой руке");
            }
    	}while(true); // Можно например закончить когда каждый поест более чем 5 раз
     } 
     catch (InterruptedException e) 
     {
         e.printStackTrace();
     }
 }
}

public class Class_main 
{
	public static void main(String[] args) 
	{
		 var list_philosophs = new ArrayList<Philosopher>();
		 list_philosophs.add(new Philosopher(true,true));
		 list_philosophs.add(new Philosopher(false,true));
		 list_philosophs.add(new Philosopher(false,false));
		 list_philosophs.add(new Philosopher(true,true));
		 list_philosophs.add(new Philosopher(false,false));
		 
		 // Запускаю потоки философов
		 (new Thread (list_philosophs.get(0))).start();
		 (new Thread (list_philosophs.get(1))).start();
		 (new Thread (list_philosophs.get(2))).start();
		 (new Thread (list_philosophs.get(3))).start();
		 (new Thread (list_philosophs.get(4))).start();
		 
		// Отдельный поток для выдачи вилок (через проверку в массиве) / и тут идет левая правая левая правая и т.д
		 Thread myThread_1 = new Thread(new Runnable()
		 {
				public void run()
				{
					boolean[] array_eating = {false,false,false,false,false,false,false,false,false,false}; 
					// Грубо говоря зануляю для новой итерации + к этому чтобы если в if не войдет то не писать else и записывать true
					// Вернул чтобы поновой не генерился а то не логично 
					Random rnd = new Random();
					while(true)
					{
						try 
						{
							Thread.sleep(5000);
							System.out.println("\n=======================NEW_EATING=========================");
							
							// Тут генерю в массиве как по условию чтобы два рядом сидяших не могли есть
							// например генерю число и от него отталкиваюсь
							// Еще интересно может получиться если поочередно а не сначала левые руки заполнить, хотя там все равно рандом
							////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// Левая рука / Потом Правая и чередуется
							int x1 = rnd.nextInt(2); // Было чисто в проверкае, но для доставерности решил сделать для каждого философа и его рук и разбил по x1, x2 и т.д
							if (x1 == 1  && array_eating[2] != true && array_eating[array_eating.length-2-1] != true) // чтобы последний философ в круге не держалвилку, но -2 т.к это леваю рука по массиву
							{
								array_eating[0] = true;
							}		
							else
							{
								// если правая и левая уже были true то зануляю
								if (array_eating[0] == true && array_eating[1] == true)
								{
									array_eating[0] = false;
								}
								
							}
							if (x1 == 1 && array_eating[array_eating.length-1] != true && array_eating[3] != true)
							{
								array_eating[1] = true;
							}
							else
							{
								if (array_eating[1] == true && array_eating[2] == true)
								{
									array_eating[1] = false;
								}
							}
							int x2 = rnd.nextInt(2);
							if (x2 == 1 && array_eating[0] != true && array_eating[4] != true) // тут и веззде чтобы 2 соседних не смогли помешать
							{
								array_eating[2] = true;
							}
							else
							{
								if (array_eating[2] == true && array_eating[3] == true)
								{
									array_eating[2] = false;
								}
								
							}
							if (x2 == 1 && array_eating[1] != true && array_eating[5] != true)
							{
								array_eating[3] = true;
							}
							else
							{
								if (array_eating[3] == true && array_eating[4] == true)
								{
									array_eating[3] = false;
								}
							}
							int x3 = rnd.nextInt(2);
							if (x3 == 1 && array_eating[2] != true && array_eating[6] != true)
							{
								array_eating[4] = true;
							}
							else
							{
								if (array_eating[4] == true && array_eating[5] == true)
								{
									array_eating[4] = false;
								}
							}
							if (x3 == 1 && array_eating[3] != true && array_eating[7] != true)
							{
								array_eating[5] = true;
							}
							else
							{
								if (array_eating[5] == true && array_eating[6] == true)
								{
									array_eating[5] = false;
								}
							}
							int x4 = rnd.nextInt(2);
							if (x4 == 1 && array_eating[4] != true && array_eating[8] != true)
							{
								array_eating[6] = true;
							}
							else
							{
								if (array_eating[6] == true && array_eating[7] == true)
								{
									array_eating[6] = false;
								}
							}
							if (x4 == 1 && array_eating[5] != true && array_eating[9] != true)
							{
								array_eating[7] = true;
							}
							else
							{
								if (array_eating[7] == true && array_eating[8] == true)
								{
									array_eating[7] = false;
								}
							}
							int x5 = rnd.nextInt(2);
							if (x5 == 1 && array_eating[6] != true && array_eating[0] != true)
							{
								array_eating[8] = true;
							}
							else
							{
								if (array_eating[8] == true && array_eating[9] == true)
								{
									array_eating[8] = false;
								}
							}
							if (x5 == 1 && array_eating[7] != true && array_eating[array_eating.length-2-1] != true)
							{
								array_eating[9] = true;
							}
							else
							{
								if (array_eating[9] == true && array_eating[array_eating.length-2-1] == true)
								{
									array_eating[9] = false;
								}
							}
							
							
							// А тут просто меняю значения в свойстве
							list_philosophs.get(0).setLeft_hand(array_eating[0]);
							list_philosophs.get(0).setRight_hand(array_eating[1]);
							
							list_philosophs.get(1).setLeft_hand(array_eating[2]);
							list_philosophs.get(1).setRight_hand(array_eating[3]);
							
							list_philosophs.get(2).setLeft_hand(array_eating[4]);
							list_philosophs.get(2).setRight_hand(array_eating[5]);
							
							list_philosophs.get(3).setLeft_hand(array_eating[6]);
							list_philosophs.get(3).setRight_hand(array_eating[7]);
							
							list_philosophs.get(4).setLeft_hand(array_eating[8]);
							list_philosophs.get(4).setRight_hand(array_eating[9]);
							
						} 
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}	
				}
			});
		 	
		 	myThread_1.start();	 
	}
}

