package javasessions;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b = 065; //octal number (every digit shoud be less than 8)
		//System.out.println(b);
		
		int a = 10;
		int b = 20;
		
		System.out.println(a==b);
		
		if (a==b) {
			System.out.println("a==b");
		}
		else {
			System.out.println("a!=b");	
		}
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		if (s1.equals(s2)) {
			System.out.println("eq");
		}
		else {
			System.out.println("not eq");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("eq");
		}

	}

}
