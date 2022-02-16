package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSort {

	public static void main(String[] args) {
		
		//ArrayList uses the Collections.sort method to sort its elements.
		
		
		   //Create and initialize an ArrayList
	       ArrayList<String> colorsList = new ArrayList<String>();
	       colorsList.add("Red");
	       colorsList.add("Green");
	       colorsList.add("Blue");
	       colorsList.add("Yellow");
	 
	       //print initial ArrayList
	       System.out.println("Initial ArrayList:" + colorsList);
	 
	       //sort ArrayList in ascending order
	       Collections.sort(colorsList);
	 
	       //print sorted ArrayList
	       System.out.println("\nArrayList sorted in ascending order:");
	       System.out.println(colorsList);
	         
	        //sort ArrayList in reverse(descending) order
	        Collections.sort(colorsList, Collections.reverseOrder());
	 
	        //print sorted list
	        System.out.println("\nArrayList sorted in descending order:");
	        System.out.println(colorsList);
	}

}
