
import java.io.IOException;

//Class with a method throwing an object of class IOException
class E1a 
{

	public void ioException() throws IOException
	{
		throw new IOException();

	}

}
public class E1 
{
	public static void main(String[] args) throws IOException
	{
//		System.out.println("IOException");
		E1a e = new E1a();
//		try {
			e.ioException();
//		} catch(Exception E) {
//			System.out.println("Exception");
//		}
	}

}
