import java.util.Scanner;

public class E3 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int numerator, divisor;
		//Continuous loop
        for (int i = 0;; i++) 
        {

            System.out.println("Enter a numerator: ");

            numerator = scan.nextInt();

            System.out.println("Enter a divisor: ");

            divisor = scan.nextInt();

            try 
            {
            	// Q = 81 q = 113
                if (numerator == 'Q' || numerator == 'q') 
                {

                    System.out.println("The loop has ended");

                    break;

              }

                System.out.println(numerator/divisor);

            }
            catch (Exception e)
            {

                System.out.println("Division by zero or Poor Input Data");

            }

        }
		
		scan.close();

    }

}
