package Builder;

public class EcommApp {
	private int orderId;
	
	public EcommApp login() {
		System.out.println("login to app");
		return this;// current class object
	}
	
	public EcommApp login(String un, String pwd) {
		System.out.println("login to app" + un);
		return this;
	}
	
	public EcommApp search(String prodName) {
		System.out.println("searching prod " + prodName);
		return this;
	}
	
	public EcommApp search(String prodName, int priceRange) {
		System.out.println("Searching prod " + prodName + priceRange);
		return this;
	}

	public EcommApp clickOnProduct(String prodName) {
		System.out.println("Click on Prod " + prodName);
		return this;
	}
	
	public EcommApp addToCart(String prodName) {
		System.out.println("Add to Cart " + prodName);
		return this;
	}
	
	public EcommApp doPayment(String cc, int cvv) {
		System.out.println("do payment cc " + cc);
		return this;
	}
	
	public EcommApp doPayment(String cc, int cvv, int otp) {
		System.out.println("do payment otp " + otp);
		return this;
	}
	
	public EcommApp doPayment(String upi) {
		System.out.println("do payment upi " + upi);
		return this;
	}
	
	public EcommApp generateOrder() {
		System.out.println("generate order " + 12345);
		this.orderId = 1234456;
		return this;
	}
	
	public int getOrderId() {
		return this.orderId;
	}
	public EcommApp sendOrderViaEmail() {
		System.out.println("send order via email " + 12345);
		return this;
	}

	public EcommApp logout() {
		System.out.println("logout");
		return this;
	}
}
