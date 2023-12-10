package ClassAndObject;

public class Employee {
//class variable -- class data member //global variable
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// String name = "Naveen";

		// class --template/blueprint of the object/ category of the object
		// object -- is a physical entity

		// object of the class; new keyword
		Employee obj = new Employee();

		obj.name = "Tom";
		obj.age = 20;
		obj.city = "LA";

		System.out.println(obj.name + " " + obj.age + " " + obj.city);

		Employee obj1 = new Employee();
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);

		obj1.name = "naveen";
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);

		// no reference objects -- not recommended
		new Employee().name = "Peter";
		new Employee().age = 30;
		new Employee().city = "Pune";

	}
}
