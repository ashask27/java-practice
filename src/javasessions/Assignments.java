package javasessions;

import java.util.Arrays;

public class Assignments {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Asha");
		
		int i = 74;
		int j = 36;
		System.out.println(i+j);
		
		System.out.println(50/3);
		
		System.out.println("==========================");
		
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + (15 / 3 * 2) - (8 % 3));
		
		System.out.println("==========================");


		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
		System.out.println("==========================");
		
		String s1="Hello Selenium";
		String s2="t";
		System.out.println(s1 + s2);
		
		System.out.println("==========================");
		
		int a = 100, b = 200, c=3400;
		System.out.println("Your total amount is. " + (a+b+c));
		
		System.out.println("==========================");
		byte b3 = 065;
		System.out.println(b3);  //prints octal value
		
		System.out.println("==========================");
		
		int x = 256, y=78, z=9;
		if (x > y && x > z) {
			System.out.println("The greatest" + x);
		}
		else if (y > x && y > z) {
			System.out.println("The greatest " + y);
		} 
		else {
			System.out.println("The greatest " + z);
		}
		System.out.println("==========================");
		
		int num = -11;
		if (num >= 0) {
			System.out.println("positive number");
		} 
		else {
			System.out.println("negative number");
		}
		
		System.out.println("==========================");
		
		int count = 0;
		for (int ii =0; ii < 40; ++ii) {
			if (count < 9 ) {
				System.out.print(" " + ii); count++;
			} else {
				System.out.println(" " + ii);
				count = 0;
			}
		}
		
		System.out.println("==========================");

		Object st[] = new Object[7];
		st[0] = "Asha";
		st[1] = 30;
		st[2] = "Knight Riders";
		st[3] = "10/03/1987";
		st[4] = 'M';
		st[5] = 98.00;
		st[6] = false;
		
		System.out.println(Arrays.toString(st));
		
		for (Object o : st) {
			System.out.print(o + " ");
		}
				
	}

}
