package ConstructorConcepts;

public class ConstructorCalling {

	String name;
	int age;
	
	
	
	public ConstructorCalling(String name) {
		 
		this.name = name;
	}


	public ConstructorCalling(int age) {
		 
		this.age = age;
	}


	public ConstructorCalling(String name, int age) {
		this(name);
		//this.name = name;
		this.age = age;
	}

	
	public static void main(String[] args) {
		//ConstructorCalling c = new ConstructorCalling();
		
	}

}
