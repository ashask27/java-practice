package javasessions;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	
	public static void main(String[] args) {
		 
		Employee e = new Employee();
		e.name = "Asha";
		e.age = 40;
		e.salary = 30.44;
		System.out.println();
		
		
		Employee e1 = new Employee();
		e1.name = "Disha";
		e1.age = 50;
		e1.salary = 450.44;		
		
		System.out.println();
		
		Employee e2 = new Employee();
		e2.name = "Kate";
		e2.age = 34;
		e2.salary = 550.44;		
		
		e = e1;
		
		System.out.println(e1.name);
		
		e1 = e2;
		
		// Object without any reference
		new Employee();
		
		System.gc(); //will call GC - not gurantee that the GC will be called
		// GC checks with JVM and if JVM gives permission only then
		// it will go and clean up the memory
		
		// Null reference object
		Employee e4 = new Employee();
		e4 = null;
		
		//System.out.println(e4.name); //Null pointer exception
		
	}

}
