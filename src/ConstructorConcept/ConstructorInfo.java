package ConstructorConcept;

public class ConstructorInfo {
	String name;
	int age;
	double salary;

	// Constructor
	// name is as same as the class name
	// can not have any return value/void
	// no return type
	// Constructor will be called when you create the object
	// Constructor will be overloaded
	public ConstructorInfo() {// 0 parameter
		System.out.println("Default Constructor");
	}

	public ConstructorInfo(int i) {// 1 parameter
		System.out.println("1 parameter Constructor" + i);
	}

	public ConstructorInfo(int i, String p) {// 1 parameter
		System.out.println("2 parameter Constructor" + i + p);
	}

	public static void main(String[] args) {
		System.out.println("Hello World");

		ConstructorInfo obj = new ConstructorInfo();
		obj.name = "tom";
		obj.age = 20;
		obj.salary = 12.33;

		ConstructorInfo obj1 = new ConstructorInfo(10);
		ConstructorInfo obj2 = new ConstructorInfo(20, "Testing");

	}

}
