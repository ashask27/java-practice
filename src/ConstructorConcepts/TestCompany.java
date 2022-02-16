package ConstructorConcepts;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {
		
		Company c1 = new Company("Amazon");
		
		System.out.println(c1.name + c1.empCount + c1.catList);

		
		Company c2 = new Company("IBM", 10000);
		System.out.println(c2.name + c2.empCount + c2.catList);

		// Cntrl+space to see all the methos
		ArrayList<String> wmList = new ArrayList<String>();
		wmList.add("Fashion");
		wmList.add("Sports");
		Company c3 = new Company("WM", 20000, wmList, true, 200.34);
		System.out.println(c3.name + c3.empCount + c3.catList);
	}

}
