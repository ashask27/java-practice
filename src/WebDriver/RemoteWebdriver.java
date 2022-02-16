package WebDriver;

public class RemoteWebdriver implements Webdriver{

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("RWD - findElement");
		
	}

	@Override
	public void findElements() {
		// TODO Auto-generated method stub
		System.out.println("RWD - findElements");
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("RWD - get");
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		System.out.println("RWD - getTitle");
		return "title";
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		System.out.println("RWD - getrl");
		return "https://abc.com";
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("RWD - click");
	}

	@Override
	public void sendKeys(String values) {
		// TODO Auto-generated method stub
		System.out.println("RWD - sendkes" + values);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("RWD - close");
	}

}
