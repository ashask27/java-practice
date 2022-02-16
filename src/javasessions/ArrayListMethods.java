package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> empInfo = new ArrayList<String>();
		
		empInfo.add("Tom");
		empInfo.add("Naveen");
		empInfo.add("Asha");
		empInfo.add("Keshav");
		
		System.out.println(empInfo);
		
		Collections.sort(empInfo);
		System.out.println(empInfo);
		
		Collections.sort(empInfo, Collections.reverseOrder());
		System.out.println(empInfo);
		System.out.println("=============================");
		ArrayList<String> stInfo = new ArrayList<String>();
		stInfo.add("Tom");
		stInfo.add("Harsh");
		stInfo.add("Divya");
		stInfo.add("Pradeep");	
		
		for(int i = stInfo.size()-1; i >= 0; i--) {
			System.out.println(stInfo.get(i));
		}

		System.out.println("=============================");
		ArrayList<String> trList = new ArrayList<String>();
		trList.add("Lisa");
		trList.add("Peter");
		trList.add("Asha");
		System.out.println(trList);
		
		trList.addAll(stInfo);
		System.out.println(trList);
		
		
		System.out.println("=============================");
		List<Integer> data = Arrays.asList(10,20,30);
		System.out.println(data);
		
		System.out.println("=============================");
		List<String> data1 = Arrays.asList("ABC", "XYZ");
		System.out.println(data1);
		
		System.out.println("=============================");
		
		
		// static arrays - different ways of declaring
		int d[] = new int[3]; // new keyword
		d[0] = 10;
		d[1] = 20;
		int dd[] = {1,2,3,4,5,6,7,8,9}; // literal array
		int ddd[] = new int[] {10,20,30,40};// new + literals
		
		System.out.println("=============================");
		
		String s = "hello"; // string literal
		String s1 = new String("hello");// String Object
	}

}
