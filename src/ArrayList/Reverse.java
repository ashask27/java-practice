package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
	      // create and initialize an ArrayList 
        ArrayList<Integer> oddList = new ArrayList<Integer>(); 
        oddList.add(1); 
        oddList.add(3); 
        oddList.add(5); 
        oddList.add(7); 
        oddList.add(9); 
        System.out.print("Initial ArrayList: " + oddList); 
        
        // use Collections.reverse method to reverse the ArrayList 
        Collections.reverse(oddList); 
        //print the ArrayList
        System.out.print("\nReversed ArrayList: " + oddList); 
	}

}
