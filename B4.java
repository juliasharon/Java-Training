
class quadExp 
{
	int a, b, c;
	
	quadExp()
	
	{

		a = 1;

		b = 1;

		c = 1;

	}

	quadExp(int d, int e, int f) 
	{

		a=d;
	
		b=e;
		
		c=f;

	}

	public String printVal() 
	{

		return "a = " + a + ", b = " + b + ", c = " + c ;

	}

	public void modifyValues(int d, int e, int f) 
	{

		a=d;
		
		b=e;
		
		c=f;

		
	}

	public int finalEq(int x) 
	{

		return ((a*x*x)+(b*x)+c);

	}
}
	public class B4 
	{

		public static void main(String[] args)
		{

		        quadExp q1 = new quadExp();

		        quadExp q2 = new quadExp(5, 10, 15);

		        System.out.println(q1.printVal());

		        System.out.println(q2.printVal());

		        q1.modifyValues(20, 25, 30);

		        System.out.println(q1.printVal());

		        System.out.println(q1.finalEq(5));

		        System.out.println(q2.finalEq(10));

		 }



		}
		




