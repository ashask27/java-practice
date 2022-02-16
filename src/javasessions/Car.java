package javasessions;

public class Car {

	// class properties/variables
	String name;
	int price;
	String color;
	String model;
	
	public static void main(String[] args) {
		//String name = "Naveen"; //local var
		//System.out.println(name);
		
		// to access class vars you have to create object of class
		// use new keyword
		
		Car c = new Car();
		c.name = "BMW";
		c.price = 70;
		c.color = "Blue";
		c.model = "420d";
		
		System.out.println(c.name + " " + c.color);
		
		Car b = new Car();
		//b.name = "AUDI";
		b.price = 70;
		b.color = "red";
		b.model = "420d";
		System.out.println(b.name + " " + b.color);
		
		// prints default values
		Car d = new Car();
		System.out.println(d.name + " " + d.color + " " + d.price + " " + d.model);
	}
}
