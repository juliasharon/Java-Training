class Count extends Thread
{
    public void run()
    {

        for(int i = 1; i<=50; i++) 
        {
        	
        	//Printing hello for multiples of 10
            if (i%10==0) 
            {

                System.out.println("Hello");

            } 
            
            //Otherwise print numbers
            else 
            {

                System.out.println(i);

            }
            
            //Try catch block to handle Interupted Exception
            try 
            {
            	
            	Thread.sleep(1000);
            } 
            
            catch(Exception e) 
            {
            	
            }
        }
    }
}

public class G5 
{

    public static void main(String[] args)
    {

        Count c = new Count();

        c.run();

    }
    
}


