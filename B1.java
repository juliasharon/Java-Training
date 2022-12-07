
class datamembers
{
	public int a = 10;
		
	private int b = 15;
		
	protected int c = 20;
		
	int d = 25;
		
	public void pub() 
	{

	    System.out.println("This is a public method");

	}

	void def() 
	{

		System.out.println("This is a default method");

	}
	protected void pro() 
	{

		System.out.println("This is a protected method");

	}

	private void pri()
	{

	     System.out.println("This is a private method");

	 }
 }
public class B1
{
	public static void main(String[] args)
	{

		datamembers obj = new datamembers();

	    System.out.println(obj.a);

//  System.out.println(obj.b);

	    System.out.println(obj.c);

	    System.out.println(obj.d);
	    
	    obj.pub();

        obj.def();

        obj.pro();

//   obj.pri();

	 }
}

