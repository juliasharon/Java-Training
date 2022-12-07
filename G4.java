public class G4 
{

    public static void main(String[] args) 
    {
    	//Thread Creation
    	
        Thread t = new Thread(new MyRunnable());
        t.start();
        t.start(); 
        
        // java.lang.IllegalThreadStateException  
    }

}

class MyRunnable implements Runnable
{
	public void run() 
    {

    }
}




