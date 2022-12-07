import java.util.*;
  
public class F5 
{
    public static void main(String[] args)
    {
  
        //Creating Hashmap
        HashMap<String, String> map = new HashMap<String, String>();
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter a string");
        
        String s=sc.nextLine();
        
        //Entering data into hashmap
        
        map.put("Bread","Butter");
        
        map.put("Pen","Pencil");  
        
        map.put("Tall","Short"); 
        
        map.put("Big","Small");  
  
        System.out.println(map);
        
        //Built-in function to check if the element is present
        
        if(map.containsValue(s))
        {
            System.out.println("yes");
        }
        else if(map.containsKey(s)) 
        {
        	System.out.println("yes");
        }
        else 
        {
        	System.out.println("no");
        }
    }
}