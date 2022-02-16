package javasessions;

public class CarType {
	
	String name;
	int price;
	String color;
	static int wheels = 4;
	

	public static void start() {
		System.out.println("start method");
	}
	
	public void stop() {
		System.out.println("stop method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 100;
		c1.color = "black";
		//c1.wheels = 4;
		System.out.println(c1.wheels);
		
		//how to access static variables
		// 1. access directly
		System.out.println(wheels);
		//2 access via class name - right way of accessing static variables
		System.out.println(CarType.wheels);
		
		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 100;
		c2.color = "red";
		//c2.wheels = 4;
		
		
		// how to access static methods
		// access directly
		start();
		c1.stop();
		// access via class name
		CarType.start();
		
	}

}
