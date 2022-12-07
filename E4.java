import java.util.*;


public class E4 
{
	public static void main(String[] args)

    {

        int studentMarks;

        Scanner scan = new Scanner(System.in);
//        int a;
        //Loop for getting the marks 10 students
        for(int i=0;i<10;i++)
        {
        	// Try block to check if any exception occurs when studentMarks is entered
            try 
            {

                    System.out.println("Enter the marks");
                    
                    

                   studentMarks = Integer.parseInt(scan.next());

            }
            // Catch block to handle NumberFormatException
//           
            catch (Exception e)
            {
            	System.out.println("Input Mismatch Exception occured");
            	
            
            }

        }

      }

 }