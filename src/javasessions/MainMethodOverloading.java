package javasessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		// Main method is called by JVM
		// Its static so that JVM does not need to create object
		// to call main method
		// void because it does not return anything
		
		System.out.println("main method");
		System.out.println(main(10));
		main(10,30);
		//return "asha";
	}

	
	public static int main(int a) {
		System.out.println("main int method");
		return 100;
	}
	
	
	public static void main(int a, int b) {
		System.out.println("main int int  method");
	}
}
