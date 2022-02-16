package OOP_Interface;

public interface UKMedical extends Medical{
	
	public void radiology();
	public void emergencyServices();
	public static void display() {
		System.out.println("static display method");
	}
	
	default void show() {
		System.out.println("default show method");	
	}
	
	
}
