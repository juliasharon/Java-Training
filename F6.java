import java.util.LinkedList;

import java.util.Iterator;

  public class F6 {

  public static void main(String[] args) {

    // create alinked list

     LinkedList<String> l_list = new LinkedList<String>();

          l_list.add("Violet");

          l_list.add("Indigo");

          l_list.add("Blue");

          l_list.add("Green");

          l_list.add("Yellow");

   System.out.println("Original linked list:" + l_list);

   l_list.sort(null);

   System.out.println("the sorted list is :"+l_list);

    Iterator it = l_list.descendingIterator();

     System.out.println("Elements in Reverse Order:");
     
     //Assigns index

     while (it.hasNext()) 
     {

        System.out.println(it.next());

     }

  }

}