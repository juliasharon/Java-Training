
import java.util.Scanner;

class Student 
{

		String studentName;

	    int rollNo;

}

class Exam extends Student
{

	    int english;

	    int science;

	    int social;

}

class Result extends Exam
{

	int totalMarks;

	public int total_mark() 
	{

	        return english+science+social;

	}

}

class C1

{

public static void main(String[] args) 
{
	
	        Scanner scan = new Scanner(System.in);

	        Result res = new Result();
	        
	        System.out.println("Enter the name of the student: ");
	        
	        res.studentName = scan.nextLine();
	        
	        System.out.println("Enter the roll no of the student: ");
	        
	        res.rollNo = scan.nextInt();

	        System.out.println("Enter the marks scored in English: " );

	        res.english = scan.nextInt();

	        System.out.println("Enter the marks scored in Science: ");

	        res.science = scan.nextInt();

	        System.out.println("Enter the marks scored in Social: ");

	        res.social = scan.nextInt();

	        System.out.println("The total marks scored is " + res.total_mark());

	        scan.close();
	        
}

}


