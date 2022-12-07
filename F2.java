import java.util.*;


public class F2
{
	
    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a string");
        
        String str = scan.nextLine();
        
        char[] data = str.toCharArray();
        char[] c = new char[data.length];
        
        for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] == ' ') {
					c[i] = data[i];
				}
			}
		}
        
        System.out.println(Arrays.toString(c));
        
        //Creating an object for Hashset
        Set s = new HashSet();
        
        for(int i=0; i<data.length; i++)
        {
        	s.add(data[i]);
        }
        //Storing in object array
        Object[] s1 = s.toArray();
        
        for(int i=0; i<s.size(); i++)
        {
            System.out.print(s1[i]+"=");
            
            //Creating an object of ArrayList class and storing it in a Collection type variable
            Collection b = new ArrayList();
            
            //Typecasting s1 from object type to char type and storing it in the variable a
            char a= (char)s1[i];
            
            for(int j=0;j<data.length; j++)
            {
            	//Comparing index
                if(a==data[j])
                {
                    b.add(j);
                }
            }
          System.out.print(b+ "");
        	
        }

        scan.close();
    }
}