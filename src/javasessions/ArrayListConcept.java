package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// Arraylist is a collection
		// Inbuilt class ArrayList - default class
		// Dynamic Array
		
		// Object of arraylist
		// By default Virtual capacity is 10
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		ar.add("tom");
		ar.add('m');
		
		//li = 0
		//hi = 3
		// length = 4
		
		ar.add(300);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		ar.add(null);
		System.out.println(ar.get(5));
		ar.add(null);
		System.out.println(ar.get(6));
		
		ar.add(5, 199);
		System.out.println(ar.get(5));
		//ar.add(8, 300);  exception
		
		
		ArrayList prod = new ArrayList(); // VC  = 10
		prod.add("A");
		prod.add("B");
		prod.add("C");
		prod.add("D");
		prod.add("E");
		
		System.out.println(prod.size());
		System.out.println(prod.get(3));
		prod.remove(3);
		System.out.println(prod.size());
		System.out.println(prod.get(3));
		
		
		// Allocate 20 virtual capacity
		ArrayList ar1 = new ArrayList(20);
		
		
		
		// Allocate 5 virtual capacity
		ArrayList ar2 = new ArrayList(5);
		
		
		// Int ArrayList
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		//marks.add("t"); exception as the ArrayList is INT only
		
		
		//Emp name, age, gender, sal, boolean
		// Object ArrayList
		
		ArrayList<Object> empInfo = new ArrayList<Object>();
		
		empInfo.add("Tom");
		empInfo.add('M');
		empInfo.add(30);
		empInfo.add(12.33);
		empInfo.add(true);
		
		System.out.println(empInfo);
		
		System.out.println("========================");
		//Traversing ArrayList
		
		for(int i = 0; i < empInfo.size(); i++) {
			System.out.println(empInfo.get(i));
		}
		
		System.out.println("========================");
		// for each
		for(Object e : empInfo) {
			System.out.println(e);
			if (e.equals('M')) {
				System.out.println("Male EMP");
			}
		}
	}

}
