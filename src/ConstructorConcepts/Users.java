package ConstructorConcepts;

public class Users {
	
	String name;
	int userId;
	boolean isPrime;
	String city;
	
//	public Users() {
//		System.out.println("default");
//	}

	public Users(String name, int userId) {
		
		this.name = name;
		this.userId = userId;
	}
	
	public Users(String name) {
		
		this.name = name;
	}
	
	public Users(String name, int userId, boolean flag, String city) {
		
		this.name = name;
		this.userId = userId;
		this.isPrime = flag;
		this.city = city;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Users u1 = new Users();
		Users u2 = new Users("tom", 899);
		
		System.out.println(u2.name + u2.userId);
		
		Users u3 = new Users("Ash");
		System.out.println( u3.name + u3.userId);
		
		Users u4 = new Users("rrr", 1, true, "UK");
		System.out.println(u4.name + u4.userId + u4.city + u4.isPrime);
		}

}
