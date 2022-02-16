package OOP_Abstractclass;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.doLogin("asha", "test123");
		lp.forgotPwd();
		lp.calculatePrice();
		Page.logo();
		lp.loading();
		lp.ajax();
		
		//Page pg = new Page();
		
		//top casting
		Page p = new LoginPage();
		
		p.url();
		p.title();
		p.calculatePrice();
		p.doLogin("fff", "fgfgf");
		
		// downcasting - NA
	}

}
