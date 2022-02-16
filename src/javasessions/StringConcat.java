package javasessions;

public class StringConcat {

	public static void main(String[] args) {
		String x = "hello";
		String xx="hello";
		String y = "world";
		
		System.out.println(x+y); //concatenation

		int a = 100;
		int b = 200;
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		double d1 = 12.33;
		double d2 = 23.44;
		
		System.out.println(d1+d2);
		
		System.out.println(x+y+d1+d2+a+b);
		System.out.println(x+y+(d1-d2+a+b));
		
		int h = 10;
		int p = 2;
		System.out.println(h/p);
		//System.out.println(9/0); // Arithmetic exception
		System.out.println(9.0/0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		//System.out.println(0/0); // Arithmetic exception
		System.out.println(0.0/0.0); //NaN  not a number
		System.out.println(0/9);
		System.out.println(8%2); //reminder
		System.out.println(9%2.0);
		System.out.println(9.2%2);
		System.out.println(0.1+0.2);
	}

}
