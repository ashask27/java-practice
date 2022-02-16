
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello this is my java code and i am so happy";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		//System.out.println(str.charAt(26));
		
		System.out.println(str.indexOf('H'));
		
		System.out.println(str.indexOf('i'));// takes the first occurrance of i
		
		
		//System.out.println(str.indexOf('i', 9));
		System.out.println(str.indexOf('i', str.indexOf('i')+1 )); // second occurrence
		
		// find 3rd occurrence of i
		
		//System.out.println(str.indexOf());
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("world")); // -1
		
		String msg = "Hello Naveen";
		
		if (msg.indexOf("null") > 0) {
			System.out.println("msg is correct");
		} else {
			System.out.println("msg incorrect");
		}
		
		String test = "welcome to java";
		
		System.out.println(test.toUpperCase());
		
		String a1 = "Welcome";// string literal
		String a2 = "Welcome";
		
		System.out.println(a1 == a2);
		if (a1.equals(a2)) {
			
		}
		
		String s3 = new String("Hello World"); // 2 objects creates
		String s4 = new String("Hello World"); // 
		String s5 = "Hello World";
		
		System.out.println(s3==s5);//false - compares references not values
		System.out.println(s3.equals(s5)); // true - compares values
	
		
		
		
		
		String s7 = "Hello Python";
		s7 = "Hello JS";
		System.out.println(s7);
		
		
		s4 = null;
		//System.out.println(s4.equals(s5)); //exception NPE
		System.out.println(s5.equals(s4)); // false
		
//		if (s4.equals(s5)) {
//			System.out.println("PASSS");
//		} else {
//			System.out.println("FAILS");
//		}
//		
		// contains
		
		String t1 = "hello world";
		String t2 = "hello World";
		// In SCP 2 objects are created as they are not the same strings
		System.out.println(t1 == t2); // false
		System.out.println(t1.equals(t2)); // false
		System.out.println(t1.equalsIgnoreCase(t2)); // true

		System.out.println(t1.contains("hello")); // true
		System.out.println(t1.contains("Hello")); // false

		// trim - trim only corner spaces.. not the middle ones
		String top = "    hello   testing   ";
		System.out.println(top.trim());
		
		//replace
		String tt = "hello world";
		
		System.out.println(tt.replace(" ", ""));
		
		String dob = "01-01-1990"; // 01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		// Split
		
		String lang = "Java_Python_Javascirpt_Ruby";
		
		String lg[] = lang.split("_");
		
		System.out.println(lg.length);
		System.out.println(lg[2]);
		
		String pop = "xXtestingxxXseleniumXxXQTPXXxXCypress";
		String p[] = pop.split("xX");
		
		System.out.println(p[0]); // empty value
		System.out.println(p[1]); //testingx
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		
		String empData = "Asha;Koli;pune;india;SDET;IBM";
		
		String em[] = empData.split(";");
		
		System.out.println(empData.split(";")[0]);
		
		for(String e : em) {
			System.out.println(e);
		}
		
		
		String s11 = "Selenium";
		// print reverse string
	}

}
