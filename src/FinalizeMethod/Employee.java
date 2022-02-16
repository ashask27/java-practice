package FinalizeMethod;

public class Employee {

	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e = null;
		
		Company c = new Company();
		c = null;
		
		System.gc();
		//e.name = "Tom";
		//System.out.println(e.name);
		
		System.out.println("Emp class");
		
		
	}
	
	@Override
	public void finalize() {
		System.out.println("Employee : In finalize method");
	}

}
