import java.util.Scanner;

//Thread1 
class Thread1 extends Thread 
{

    public void printValue(int a)
    {
    	//Condition for odd thread
    	if (a%2!=0) 
    	{

	        System.out.println("T1");
	
	        System.out.println(a);
    	}

    }

}

//Thread2 
class Thread2 extends Thread 
{

    public void printValue(int a)
    {
    	//Condition for even thread
    	if (a%2==0) 
    	{

            System.out.println("T2");

            System.out.println(a);
		}

    }

}

public class G2
{

    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);
        
        //Creating object for Thread1 and Thread2
        Thread1 t1 = new Thread1();

        Thread2 t2 = new Thread2();

        for (int i = 1; i <= 100; i++) 
        {
        	t1.printValue(i);
        	
        	t2.printValue(i);
        	
        }

        scan.close();

    }

}