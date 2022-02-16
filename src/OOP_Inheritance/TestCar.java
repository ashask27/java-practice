package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start(); // overridden
		b.autoParking(); // Individual method
		b.refuel(); // inherited
		b.stop(); // inherited
		b.engine(); //inherited
		
		BMW.price();
		Car.price();
		
		Car c1 = new Car();
		c1.start();
		c1.stop();
		
		// Top Casting
		
		// Child class object can be referred by parent class reference variable
//		// Output  
//		BMW - Start
//		car - Stop
//		car - refuel
//		Vehicle - engine
		Car c2 = new BMW();
		c2.start();
		c2.stop();
		c2.refuel();
		//c2.autoParking();  Individual methods of child cannot be accessed.. reference type check is done
		c2.engine();
		
		
		// Down casting - not allowed
		// Parent class object can be referred by child class reference variable
		//BMW b1 = new Car();  // compile time error
		//BMW b1 = (BMW) new Car(); // Runtime error
		
		Vehicle v1 = new BMW();
		v1.engine();
		
		
		//BMW bb = (BMW)new Vehicle(); // run time error
		
		Car cc = new Audi();
		
		
		Audi aa = new Audi();
		aa.theftSafetyMethod();
		
		
		
	}

}
