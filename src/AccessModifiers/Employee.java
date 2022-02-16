package AccessModifiers;

public class Employee {

	public String name;
	
	private int salary;
	
	protected String dob;
	
	String city;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.name = "tom";
		e.salary = 10;
		e.city = "LA";
		e.dob = "10 JAN";
	}

}
