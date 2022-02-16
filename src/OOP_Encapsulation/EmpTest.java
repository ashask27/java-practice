package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setName("asha");
		e1.setAge(30);
		e1.setSalary(10000);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		Employee e2 = new Employee();
		e2.setInfo("tom", 80, 878979);
		System.out.println(e2.getInfo());
	}

}
