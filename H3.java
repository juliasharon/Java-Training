import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class H3
{
    public static void main(String[] args) throws IOException 
    {
        FileOutputStream a=new FileOutputStream("/Users/juliasharon.t/eclipse-workspace/Julia/src/textfile");
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter value of Multiples:");
        
        int m=sc.nextInt();
        
        //initializing value to the result.
        int result=0;
        
        //iterating till 10 value.
        for(int i=1;i<=10;i++)
        {
            result=m*i;
            
            //format to be print.
            String table=m + " * " + i + " = " + result +"\n";
            
            System.out.println(table);
            
            //to convert data in file into byte format.
            a.write(table.getBytes());
        }
    }
}