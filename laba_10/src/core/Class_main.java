///////////////////////// ���������������� ��� � ������ ���� �� �������� �� ���� � �� ������, ����� ����� � ��� ������� ++ ������


package core;
import java.util.ArrayList;
////////////////////////////////////////////// �������� ID ������ ����� ID �������� - Thread.currentThread().getId()
import java.util.Random;


class Philosopher implements Runnable{
    private boolean left_hand, right_hand;
    public boolean isRight_hand() {
		return right_hand;
	}
	public void setRight_hand(boolean right_hand) {
		this.right_hand = right_hand;
	}
	// ���������
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
    		// ��������� ����� ��������
    		Random rnd = new Random();
    		Thread.sleep(rnd.nextInt(4000));
            if (left_hand == true && right_hand == true) // ��� ����� � �����
            {
           	 // �������� ��� �� ID ����� ��������� ����� ��������� ������� � ������� ��� �����. ����� ����.
           	 System.out.println("������� ID = " + Thread.currentThread().getId() + " ������ ��������");
            }
            else if (left_hand == false && right_hand == false)  // ���� ����� � �����
            {
           	 System.out.println("������� ID = " + Thread.currentThread().getId() + " ������");
            }
            else if (left_hand == true && right_hand == false)  // ����� � ����� ����
            {
           	 System.out.println("������� ID = " + Thread.currentThread().getId() + " ������ ����� � ����� ����");
            }
            else if (left_hand == false && right_hand == true)  // ����� � ����� ����
            {
           	 System.out.println("������� ID = " + Thread.currentThread().getId() + " ������ ����� � ������ ����");
            }
    	}while(true); // ����� �������� ��������� ����� ������ ����� ����� ��� 5 ���
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
		 
		 // �������� ������ ���������
		 (new Thread (list_philosophs.get(0))).start();
		 (new Thread (list_philosophs.get(1))).start();
		 (new Thread (list_philosophs.get(2))).start();
		 (new Thread (list_philosophs.get(3))).start();
		 (new Thread (list_philosophs.get(4))).start();
		 
		// ��������� ����� ��� ������ ����� (����� �������� � �������) / � ��� ���� ����� ������ ����� ������ � �.�
		 Thread myThread_1 = new Thread(new Runnable()
		 {
				public void run()
				{
					boolean[] array_eating = {false,false,false,false,false,false,false,false,false,false}; 
					// ����� ������ ������� ��� ����� �������� + � ����� ����� ���� � if �� ������ �� �� ������ else � ���������� true
					// ������ ����� ������� �� ��������� � �� �� ������� 
					Random rnd = new Random();
					while(true)
					{
						try 
						{
							Thread.sleep(5000);
							System.out.println("\n=======================NEW_EATING=========================");
							
							// ��� ������ � ������� ��� �� ������� ����� ��� ����� ������� �� ����� ����
							// �������� ������ ����� � �� ���� ������������
							// ��� ��������� ����� ���������� ���� ���������� � �� ������� ����� ���� ���������, ���� ��� ��� ����� ������
							////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// ����� ���� / ����� ������ � ����������
							int x1 = rnd.nextInt(2); // ���� ����� � ���������, �� ��� ������������� ����� ������� ��� ������� �������� � ��� ��� � ������ �� x1, x2 � �.�
							if (x1 == 1  && array_eating[2] != true && array_eating[array_eating.length-2-1] != true) // ����� ��������� ������� � ����� �� �����������, �� -2 �.� ��� ����� ���� �� �������
							{
								array_eating[0] = true;
							}		
							else
							{
								// ���� ������ � ����� ��� ���� true �� �������
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
							if (x2 == 1 && array_eating[0] != true && array_eating[4] != true) // ��� � ������ ����� 2 �������� �� ������ ��������
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
							
							
							// � ��� ������ ����� �������� � ��������
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

