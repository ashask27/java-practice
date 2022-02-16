package OOP_Interface;

public interface USMedical extends Medical {
	
	int min_fee = 10; //by default final and static
	
	
	public void physio();
	
	public void oncology();
	
	public void cardio();
	
	public void emergencyServices();

	@Override
	public void vaccination();
	
	// static method (after jdk 1.8)
	public static void billing() {
		System.out.println("US medical - billing");
	}
	
	// default non static method (after jdk 1.8)
	default void optServices () {
		System.out.println("US medical - OPT");
	}
}
