package Builder;

public class ShoppingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcommApp e1 = new EcommApp();
		
//		e1.login();
//		e1.search("mac");
//		e1.addToCart("mac");
	
		// Builde Pattern
		// we can do the chaining as below only when method returns
		// this reference 
		//uc1
		int orderId = e1.login()
			.search("MAC")
			.addToCart("MAC")
			.clickOnProduct("MAC")
			.doPayment("123466")
			.generateOrder()
			.sendOrderViaEmail()
			.getOrderId();
		
		System.out.println("order id " + orderId);
		
		
		
		//uc2
		e1.login()
		.search("IPAD")
		.logout();
		
		
		//uc3
		e1.login()
		.search("phone")
		.addToCart("phone")
		.search("dress")
		.addToCart("dress")
		.doPayment("4565465")
		.generateOrder()
		.sendOrderViaEmail()
		.logout();
		
	}

}
