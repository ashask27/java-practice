package javasessions;

public class Student {
	
	// WAF 
	// name : getStudentMarks
	// input param : name (string)
	// return : marks (int)
	
	public int getStudentMarks(String stName) {
		int marks = -1;
		
		System.out.println("getting marks for " + stName);
		
		if (stName.equals("sameer")) {
			marks = 90;
		} 
		else if (stName.equals("asha")) {
			marks = 95;
		}
		else if (stName.equals("ram")) {
			marks = 190;
		}
		else {
			System.out.println("Invalid name");
		}
		return marks;
	}

	public static void main(String[] args) {
 		Student st1 = new Student();
 		int m = st1.getStudentMarks("asha");
 		if (m == -1) {
 			System.out.println("dont generate marksheet");
 		}
 		else  {
 			System.out.println(m+10);
 		}
		
		
	}

}
