package OOP_Inheritance;

public class BMW extends Car {
	
	// Start method is overridden
	@Override
	public void start() {
		System.out.println("BMW - Start");
	}

	// Individual method
	public void autoParking() {
		System.out.println("BMW - Auto parking");
	}

	// method hiding
	public static void price() {
		System.out.println("BMW - Price");
	}
}
