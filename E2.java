// Creating Custom Exception class
class MyException extends Exception
{
	
	public static void votingAge(int age) throws MyException
	{
		if (age < 18) 
		{
			throw new MyException("You cannot Vote");
		}
		else 
		{
			System.out.println("You are Eligible for Voting");
		}
	}
	//Creating MyException Constructor
	public MyException(String str)
	{
		System.out.println(str);
	}
}


public class E2 
{
	
    public static void main(String [] args)
    {
    	//try-catch block
        try
        {
            MyException.votingAge(10);
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}

