package OOP_Encapsulation;

public class Browser {

	private void checkOSCompatibility() {
		System.out.println("check OS compatible");
	}
	
	private void checkBrowserversion() {
		System.out.println("check browser version");
	}
	
	private void enoughRAM() {
		System.out.println("enoughRAM");
	}
	
	public void launchBrowser() {
		System.out.println("trying to launch chrome");
		checkOSCompatibility();
		checkBrowserversion();
		enoughRAM();
		System.out.println("Browser Launched");
	}
}
