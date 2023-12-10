package ConstructorConcept;

public class ConstructorInfoTest {
	String name;
	int age;
	double salary;

	// hidden Constructor/default Constructor

	public ConstructorInfoTest(String name) {
		this.name = name;

	}

	public ConstructorInfoTest(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public ConstructorInfoTest(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {

		ConstructorInfoTest c1 = new ConstructorInfoTest("Tom");
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);

		ConstructorInfoTest c2 = new ConstructorInfoTest("Abhi", 25);
		System.out.println(c2.name + " " + c2.age + " " + c2.salary);
		c2.salary = 25.55;
		System.out.println(c2.name + " " + c2.age + " " + c2.salary);

		ConstructorInfoTest c3 = new ConstructorInfoTest("peter", 30, 10.22);
		System.out.println(c3.name + " " + c3.age + " " + c3.salary);
	}

}
