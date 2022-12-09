import java.io.*;

import java.util.Scanner;

class H4
{
	
    public static void readFile() throws IOException 
    {
    	//To read the data of a file
        FileInputStream in = new FileInputStream("/Users/juliasharon.t/eclipse-workspace/Julia/src/textfile");
        
        //To write the data into a file
        FileOutputStream out= new FileOutputStream("/Users/juliasharon.t/eclipse-workspace/Julia/src/file2.txt");
        
        int a= in.read();
        
        while(a!=-1)
        {
            
            //To read the file character by character
            a=in.read();
            
            out.write(a);
        }
        out.flush();
        
        out.close();
    }

    public static void main(String[] args) throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        
        readFile();
    }
}