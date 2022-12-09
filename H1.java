import java.io.FileInputStream;

public class H1 
{
    public static void main(String[] args) 
    {
        try {
        	
        	//To read the contents of a file
        	
            FileInputStream a = new FileInputStream("/Users/juliasharon.t/eclipse-workspace/Julia/src/textfile");
            
            //to Traverse the string
            int count = 0;
            
            while ((count = a.read())!=-1)
            {
                System.out.print((char) count);
            }
            a.close();
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}