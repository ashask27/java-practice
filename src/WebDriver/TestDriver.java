package WebDriver;

public class TestDriver {

	public static void main(String[] args) {
		
		String browser = "Chrome";
		
		//ChromeDriver cc = new ChromeDriver();
		//FFDriver cc = new FFDriver();
		
		RemoteWebdriver cc = null;
		//Webdriver cc = null;
		if (browser.equals("Chrome")) {
			cc = new ChromeDriver();
		} else if (browser.equals("FF")) {
			cc = new FFDriver();
		}
		
		// if you want to call a method specific to child class using parent reference
		// cast it to child first
		((ChromeDriver)cc).display();
		
		
		System.out.println(cc.getUrl());
		System.out.println(cc.getTitle());
		
		cc.findElement();
		cc.findElements();
		cc.sendKeys("Asha");
		cc.click();
		cc.close();
		
	}

}
