package OOP_Encapsulation;

public class LoginPage {
	
	private String username;
	private String password;
	
	
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	// business features : public method
	// this is not encapsulation as we are not doing 
	// any modification on private members
	public void doLogin(String username, String password) {
		// enter the details and press on login
		System.out.println("Enter usrname");
		System.out.println("Enetr password");
	}

	// this is encapsulation as we are accessing private members
	public void doLogin() {
		// enter the details and press on login
		System.out.println("Enter usrname" + this.username);
		System.out.println("Enetr password" + this.password);
	}
}
