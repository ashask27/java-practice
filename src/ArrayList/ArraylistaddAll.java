package ArrayList;

import java.util.ArrayList;

public class ArraylistaddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       ArrayList<Integer> numList = new ArrayList<Integer>();
	       numList.add(5);
	       numList.add(7);
	       numList.add(9);
	       numList.add(19);
       
	       ArrayList<Integer> numList2 = new ArrayList<Integer>();
	       numList2.add(1);
	       numList2.add(2);
	       numList2.add(3);
	       numList2.add(4);
	       
//	       numList.addAll(numList2);
//	       System.out.println(numList);
	       
	       //Add from  a particular index
	       numList.addAll(3, numList2);
	       System.out.println(numList);
	       
	}

}
