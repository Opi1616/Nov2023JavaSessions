package ConstructorAssignment;

public class PersonInfo {

	String name;
	int age;
	char gender;
	double height;

	public PersonInfo(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {

		PersonInfo p = new PersonInfo("Rohit", 56, 'm', 126.00);
		System.out.println(p.name + " " + p.age + " " + p.gender + " " + p.height);
	}

}
