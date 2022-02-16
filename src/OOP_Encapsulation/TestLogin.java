package OOP_Encapsulation;

public class TestLogin {
	public static void main(String[] args) {
		LoginPage l = new LoginPage("asha", "test123");
		
		System.out.println(l.getUsername());
		System.out.println(l.getPassword());
		
		LoginPage u = new LoginPage("ram", "test123"); //POST call
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		
		// reset password for u
		u.setPassword("xyz123"); // update/PUT call
		System.out.println(u.getUsername()); // GET call
		System.out.println(u.getPassword());
		
		u.doLogin(u.getUsername(), u.getPassword());
		
		LoginPage u5 = new LoginPage("test", "test123");
		u.doLogin();
	}
	
}
