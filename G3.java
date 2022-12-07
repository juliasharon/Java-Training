public class G3 
{

    Object world = new Object();
    
    Object hello = new Object();
    
    public static void main(String[] args) throws InterruptedException
    {
        for(int i=0;;i++)
        {
            Runnable helloTask = new Runnable()
            {
                
                public void run()
                {
                    new G3().printHello();
                }
            };
            Runnable worldTask = new Runnable()
            {
               
                public void run()
                {
                    new G3().printWorld();
                }
            };
            Thread t1 = new Thread(helloTask);
            
            Thread t2 = new Thread(worldTask);
            
            t1.start();
            
            t1.join();
            
            t2.start();
            
            t2.join();
        }

    }

    public void printHello()
    {
        synchronized (world) 
        {
            System.out.println("QA ACE 2023");
        }
    }

    public void printWorld()
    {
        synchronized (hello) 
        {
            System.out.println("Hello");
        }
    }
}