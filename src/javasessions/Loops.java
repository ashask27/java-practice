package javasessions;

public class Loops {

	public static void main(String[] args) {
		
		// while loop
		int i =1;
		while(i <= 100) {
			System.out.println(i++);
		}
		System.out.println("=================");
		boolean flag = true;
		int num = 1;
		while(flag) {
			System.out.println("Welcome to Taj");
			num++;
			if(num == 5) {
				break;
			}
		}
		
		// For loop
		
//		for(int j=0; j<10; j++) {
//			System.out.println(j);
//		}
		
//		int j = 0;
//		for(; j<=10; j++) {
//			System.out.println(j);	
//		}
		System.out.println("=================");
		int j = 0;
		for(; j<10;) {
			System.out.println(j);
			j++;
		}
		
		// Infinite loop
//		for(;;) {
//			System.out.println("hello");
//		}

		System.out.println("=================");
		for(double d=1.1; d<=10.5; d++) {
			System.out.println(d);
		}
		
		System.out.println("=================");
		for(char d='a'; d<='z'; d++) {
			System.out.println(d + ":" + (int)d);
		}
		
		System.out.println("=================");
		for(char d='A'; d<='Z'; d++) {
			System.out.println(d + ":" + (int)d);
		}
		
		System.out.println("=================");
		for(char d='0'; d<='9'; d++) {
			System.out.println(d + ":" + (int)d);
		}
		
		System.out.println("=================");
		for(int x=1; x<=9; x = x+2) {
			System.out.println(x);
		}
		System.out.println("=================");
		
		
		// num % 2 == 0 - even
		// num % 2 == 1 - odd
		for(int x=1; x<=9; x++ ) {
			if (x%2 == 0) {
				System.out.println("Even : " + x);
			}
			else if (x%2 == 1) {
				System.out.println("Odd : " + x);
			}
		}	
		
		// do while loop
		int x = 1;
		do {
			System.out.println(x);
			x++;
		} while(x<=10);
		
	}

}
