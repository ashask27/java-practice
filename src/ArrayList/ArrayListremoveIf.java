package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListremoveIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num ->num %2!=0);

		System.out.println("Print even numbers --->"+numbers);
	
		ArrayList<Integer> numbers1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers1.removeIf(num ->num %2==0);
		System.out.println("Print odd numbers --->"+numbers1);
	}

}
