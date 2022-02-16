package javasessions;

public class Users {

	//methods (function)
	// no input , no return
	public void testLogin() {
		System.out.println("function call");
		return;
	}
	
	// no input, return int
	public int getNumber() {
		System.out.println("get number");
		return 100;
	}
	
	public boolean testLinkExists() {
		return true;
	}
	
	public String getTrainerName() {
		return "Asha";
	}
	
	// give me Input will return some values
	public int add(int a, int b) { // parameters
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users obj = new Users();
		obj.testLogin();
		
		
		int x = obj.getNumber();
		System.out.println(x);
		
		String str = obj.getTrainerName();
		System.out.println(str);
		
		boolean flag = obj.testLinkExists();
		System.out.println(flag);
		
		System.out.println(obj.add(90,100)); //arguments
	}

}
