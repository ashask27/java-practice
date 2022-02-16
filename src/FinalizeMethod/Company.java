package FinalizeMethod;

public class Company {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void finalize() {
		System.out.println("Company : In finalize method");
	}

}
