package ConstructorConcepts;

public class Employee {
	
	String name;
	int age;
	String empId;
	String dept;
	
	//constructor
	public Employee() {
		System.out.println("constrcutor no param");
	}
	
	//constructor
	public Employee(int i) {
		System.out.println("constrcutor 1 param  " + i);
	}
	
	//constructor
	public Employee(String s, int i) {
		System.out.println("constrcutor 2 param "+ s + i);
	}
	
	//constructor
	public Employee(int s, String i) {
		System.out.println("constrcutor 2 param "+ s + i);
	}
	public static void main(String[] args) {
		Employee emp = new Employee("asha", 9);
		Employee e1 = new Employee(9);
		Employee e2 = new Employee();

	}

}
