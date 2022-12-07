
interface Violet
{
	public void colour1();
}

interface Indigo 
{
	public void colour2();
}

class Rainbow implements Violet,Indigo 
{
	public void colour1() 
	{
		System.out.println("Violet is the first colour on the rainbow");
	}
	public void colour2() 
	{
		System.out.println("Indigo is the second colour on the rainbow");
	}
}

class C5
{

public static void main(String[] args) 
{
	Rainbow obj = new Rainbow();
	obj.colour1(); 
	obj.colour2();
}

}

