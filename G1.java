class T1 extends Thread implements Runnable 
{

}

class T2 extends Thread implements Runnable 
{
	
}


public class G1 
{

    public static void main(String[] args) 
    {

        T1 t1 = new T1();
        
        //Naming the thread to Julia

        t1.setName("Julia");

        System.out.println(t1.getName());

        T2 t2 = new T2();
        
       //Naming the thread to Sharon

        t2.setName("Sharon");

        System.out.println(t2.getName());

    }

}
