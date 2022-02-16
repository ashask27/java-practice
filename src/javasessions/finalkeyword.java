package javasessions;

public class finalkeyword {
	
	public static void test() {
		try {
			System.out.println("test()");
			return;
			//throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}

	// this is called before the gc call..
	public void finalize() {
		System.out.println("finalize");
	}
	public static void main(String[] args) {
		final int i =10;
		
		test();
		
		finalkeyword f1 = new finalkeyword();
		f1=null;
		
		System.gc();
	}

}
