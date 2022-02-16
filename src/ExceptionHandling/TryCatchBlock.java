package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try {
			//int i = 9/0;
			int k[] = new int[2];
			k[4] = 10;
			System.out.println("Hello");
		} 
		catch(ArithmeticException e) {
			System.out.println("Artihmetic exception");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB exception");
			e.printStackTrace();	
		}
		catch(Exception e) {
			System.out.println("Some exception");
			e.printStackTrace();	
			
		}
//		catch (Throwable e) {
//			System.out.println("Some exception");
//			e.printStackTrace();			
//		}
		System.out.println("Bye");
	}

}
