class Base extends Exception 
{
	Base() throws Base
	{
		throw new Base();
	}
}

class Derived1 extends Base7 
{
	Derived1()
	{
		try 
		{
			Base b = new Base();
		} catch(Exception e)
		{
			System.out.println("Caught");
		}
	}
}

public class E5b 
{

    public static void main(String args[])

    {
    	Derived1 d = new Derived1();
    }

}