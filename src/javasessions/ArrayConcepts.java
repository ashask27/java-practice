package javasessions;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		
		//int i = 10;
		
		// int array
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		//a[4] = 10;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		//System.out.println(a[4]);
		//System.out.println(a[-1]);
		
		System.out.println(a[0]+a[2]);
		System.out.println(a.length);
		
		// index based for loop
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
		}
		
		System.out.println("-------------------");
		// for each loop : enhanced loop
		for(int e : a) {
			System.out.println(e);
		}
		
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		//double array
		
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.44;
		System.out.println("-------------------");
		for (double e : d) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(d));
		
		// char array
		char c[] = new char[3];
		c[0] =  'a';
		c[1] = 'b';
		c[2] = '1';
		System.out.println(c[0]+c[1]);
		
		// String array
		String emp[] = new String[3];
		
		emp[0] = "asha";
		emp[1] = "sk";
		System.out.println(emp[0]+emp[1]);
		
		for(String s : emp) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(emp));
		
		//5. Oject Array
		// Object is a class in Java
		
		Object st[] = new Object[4];
		st[0] = "Asha";
		st[1] = 30;
		st[2] = 3400.00;
		st[3] = 'f';
		
		for(Object e : st) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(st));
		
				
	}

}
