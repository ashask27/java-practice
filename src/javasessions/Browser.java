package javasessions;

public class Browser {

	// launch a browser
	// input parameter : name (string)
	// return : void
	public boolean launchBrowser(String str) {
		System.out.println("browser name is " + str);
		
		if (str.equals("chrome")) {
			System.out.println("launch chrome");
			return true;
		} 
		else if (str.equals("firefox")) {
			System.out.println("launch firefox");
			return true;
		}
		else {
			System.out.println("please pass correct browser");
			return false;
		}
	}
	
	public boolean openBrowser(String str) {
		System.out.println("browser name is " + str);
		boolean flag = false;
		
		switch(str.toLowerCase()) {
		case "chrome": 
			System.out.println("launch chrome");
			flag = true; break;
	
		case "firefox":
			System.out.println("launch firefox");
			flag = true; break;
			
		default:
			System.out.println("provide correct browser");
			
		}
		return flag;
	}
			
			
	// Main method does not return anything
	// JVM calls this method first
	public static void main(String[] args) {
		Browser b = new Browser();
//		if(b.launchBrowser("opera")) {
//			System.out.println("browser launched");
//		} else {
//			System.out.println("browser not launched");
//		}
		
		if(b.openBrowser("chrome")) {
			System.out.println("browser launched");
		} 
		else {
			System.out.println("browser not launched");
		}
	}

}
