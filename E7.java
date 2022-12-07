class Base7 
{
	
	Base7() 
	{
		System.out.println(10/0);
	}
}

class Derived7 extends Base7 
{
	
	Derived7()
	{
		try 
		{

	        Base7 b = new Base7();

	    }
	    //Derived class cannot catch the exception of base class
	    catch (Exception e) 
		{
	    	System.out.println("Caught");
	    }
	}
	
}

public class E7 
{
	public static void main(String[] args)
	{
		Derived7 d = new Derived7();
	}
}
