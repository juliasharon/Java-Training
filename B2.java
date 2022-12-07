
class protecteddata 
{

	 protected int a = 10;

}
public class B2 
{
	public static void main(String[] args) 
	{

		protecteddata  obj = new protecteddata ();

		System.out.println(obj.a);

		obj.a = 15;

		System.out.println(obj.a);

	 }


}



