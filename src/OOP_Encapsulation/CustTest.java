package OOP_Encapsulation;

public class CustTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Brad", 40, "Mumbai");
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());
		
		c1.setCity("Bangalore");
		System.out.println(c1.getCity());
	}

}
