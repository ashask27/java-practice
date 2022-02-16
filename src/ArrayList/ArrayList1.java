package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayList1 { 
   public static void main(String[] args) {        
       //define new ArrayList and initialize it
       ArrayList<Integer> numList = new ArrayList<Integer>();
       numList.add(5);
       numList.add(7);
       numList.add(9);
       numList.add(19);

       //print the ArrayList
       System.out.println("Initial ArrayList:");
       System.out.println(numList);
       numList.add(29);
       numList.add(19);
       numList.add(69);
       numList.add(29);
       numList.add(19);       
       System.out.println("size of arrayList " + numList.size());
       //use add method with index=0 to add elements to the beginning of the list
       numList.add(0, 3);
       numList.add(0, 1);
        
       System.out.println("ArrayList after adding elements at the beginning:");
       
  
       //print ArrayList
       System.out.println(numList);  
       System.out.println("get element at index 3 :" + numList.get(3));
       
       System.out.println("size of arrayList " + numList.size());
       
       ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10,1,2,4,5,6,7,8));
       System.out.println(list2);
      
       String[] array = new String[] {"A", "B", "C"};
       List<String> list1 = Arrays.asList(array);
       
       List<String> list3 = new ArrayList<>(Arrays.asList(array));
       List<String> list4 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
       
       System.out.println(list1.equals(list3));
       System.out.println(list1.equals(list4));

       //Create a sublist
       ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(10,1,2,4,5,6,7,8));
       
       ArrayList<Integer> subli = new ArrayList<Integer>(li.subList(2, 5));
       System.out.println(subli);
      
       //// Convert Arraylist to Array
       ArrayList<Integer> lili = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60,90,87,50));
       Object myArray[] = lili.toArray();
       System.out.println(Arrays.toString(myArray));
   }
}