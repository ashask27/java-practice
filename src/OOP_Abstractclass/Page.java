package OOP_Abstractclass;

public abstract class Page extends WebPage implements W3C{
	
	public Page() {
		System.out.println("Page - CONST");
	}
	public abstract void title();
	public abstract void url();
	
	public void doLogin(String un, String pwd) {
		System.out.println("Page - Login");
	}
	
	// static as logo does not change for each page
	// you can make it either final or static... but
	// final - gives a copy of method to each object
	//so make it static..so there is only 1 copy
	public static void logo() {
		System.out.println("Page - Logo");
	}
	
	// final because calculation does not change for each page
	// and we dont want to override this method
	public final void calculatePrice() {
		System.out.println("Page - Calculate price");
	}
	
	@Override
	public void loading() {
		System.out.println("Page - loading ");
	}
	
	
	@Override
	public final void ajax() {
		System.out.println("Page - ajax ");
	}

}
