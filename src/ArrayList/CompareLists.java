package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareLists {

	public static void main(String[] args) {
	
	       ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,1,2,4,5,6,7,8));
	       ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10,1,2,4,5,6,7,8, 3));
	       
	       // Sort and then equals
	       Collections.sort(list1);
	       Collections.sort(list2);
	       
	       System.out.println(list1);
	       System.out.println(list2);
	       System.out.println(list1.equals(list2));

	       
	       // find out additional element
	       ArrayList<Integer> l3 = new ArrayList<Integer>(Arrays.asList(10,1,2,4,5,6,7,8, 12));
	       ArrayList<Integer> l4 = new ArrayList<Integer>(Arrays.asList(10,1,2,4,5,6,7,8,3,9));
	       
	       l4.removeAll(l3);
	       System.out.println(l4);
	       
	       // find out common element
	       ArrayList<Integer> l5 = new ArrayList<Integer>(Arrays.asList(10,1,2,4,5,6,7,8, 12));
	       ArrayList<Integer> l6 = new ArrayList<Integer>(Arrays.asList(10,1,2,4,5,6,7,8,3,9));
	       
	       l6.retainAll(l5);
	       System.out.println(l6);
	}

}

