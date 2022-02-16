package OOP_Inheritance;

public class Car extends Vehicle{
	
	public void start() {
		System.out.println("car - Start");
	}

	public void stop() {
		System.out.println("car - Stop");
	}

	
	public void refuel() {
		System.out.println("car - refuel");
	}

	public static void price() {
		System.out.println("Car - price");
	}
}
