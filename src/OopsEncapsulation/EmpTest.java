package OopsEncapsulation;

public class EmpTest {

	public static void main(String[] args) {

		// POST -Create
		Employee e1 = new Employee("Navin", 25, 12.33, "pune", "India");
//		e1.setName("Navin");
//		e1.setAge(25);
//		e1.setCity("pune");
//		e1.setCountry("India");
//		e1.setSalary(12.33);
		
		// GET -Retrieve
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getCountry());
		System.out.println(e1.getSalary());
		System.out.println("------------");

		// PUT-Update
		e1.setAge(26);
		e1.setSalary(22.333);

		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getCountry());
		System.out.println(e1.getSalary());

	}

}
