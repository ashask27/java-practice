package AccessModifiers;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		
		// only default, public, protected variables can be accessed
		
		e.city = "LA";
		e.dob = "10 JAN";
	}

}
