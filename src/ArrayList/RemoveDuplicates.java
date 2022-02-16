package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;



public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> lili = new ArrayList<Integer>(Arrays.asList(10,20,10,40,20,60,90,10,20));
		System.out.println(lili);

		// Linkedhash set
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>(lili);
		ArrayList<Integer> numbers = new ArrayList<Integer>(linkedhashset);
		
		System.out.println(numbers);
		
		//JDk -8 Stream
		
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(10,20,10,40,20,60,90,10,20));
		List<Integer> newList = marks.stream().distinct().collect(Collectors.toList());
		System.out.println(newList);
	}

}
