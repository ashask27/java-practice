package WrapperClasses;

public class WrapperConcepts {

	public static void main(String[] args) {
		
		String str = "100";
		System.out.println(str+20);
		int value = Integer.parseInt(str);
		System.out.println(value);
		
		
		String str1 = "100A";
		//int value1 = Integer.parseInt(str1);
		System.out.println(str1+20);
		
		int i =10;
		String ii = String.valueOf(i);
		System.out.println(ii);
		
		String total = "200.12";
		Double dble = Double.parseDouble(total);
		System.out.println(dble);
		
		String msg = "Your order id is 123456";
		
		String substr = msg.substring(msg.indexOf("is")+3);
		System.out.println(substr);
	
		String[] ss = msg.split("is");
		System.out.println(ss);
	}

}
