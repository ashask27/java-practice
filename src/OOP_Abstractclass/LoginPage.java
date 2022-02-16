package OOP_Abstractclass;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP - CONST");
	}

	@Override
	public void title() {

		System.out.println("LP - title");
		
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		System.out.println("LP - url");
	}
	
	@Override
	public void doLogin(String un, String pwd) {
		System.out.println("LP - Login");
	}
	
	
	public void forgotPwd() {
		System.out.println("LP - forgotPwd");
	}

//	@Override
//	public void ajax() {
//		// TODO Auto-generated method stub
//		System.out.println("LP - ajax");
//	}


}
