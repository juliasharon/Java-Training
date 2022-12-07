import java.util.*;

class F3

{ 

    public static void main(String argv[]) {

        String s;

        Scanner sc=new Scanner(System.in);

        System.out.print("::Start Entering Paragraph from Here::\n\t"); 

        s=sc.nextLine();

//        char[] c=s.toCharArray();

        System.out.println(s);

        String[] words = s.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("Capitalizing plural words");

        for (int i = 0; i < words.length; i++) {

            int l = words[i].length()-1;

            if (words[i].endsWith("s")) {

                words[i] = words[i].toUpperCase();

            }

        }

        System.out.println(Arrays.toString(words));

    }}