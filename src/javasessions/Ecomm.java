package javasessions;

public class Ecomm {
	
	// Overloaded methods
	public void test() {
		System.out.println("test method");
	}
	
//	public int test() {
//		System.out.println("test method");
//		return 10;
//	}
	
	public void test(int i) {
		System.out.println("test method with int paramter");
	}

	public void test(double i) {
		System.out.println("test method with double paramter");
	}

	public void test(int i, int j) {
		System.out.println("test method with 2 paramter");
	}
	
	public void test(int i, String j) {
		System.out.println("test method with int string paramter");
	}
    //sequence of the parameters matters when different 
	//type of parameters are 
	//used
	public void test(String i, int j) {
		System.out.println("test method with string int paramter");
	}
	
	public static void main(String[] args) {
		Ecomm e = new Ecomm();
		e.test(4.0);
		e.test();
		e.test(1,3);
	}

}
