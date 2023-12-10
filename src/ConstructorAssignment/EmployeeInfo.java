package ConstructorAssignment;

public class EmployeeInfo {

	int id;
	String name;
	double salary;

	public EmployeeInfo(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {

		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		salary = salary * 1.10;
	}

	public static void main(String[] args) {

		EmployeeInfo obj = new EmployeeInfo(121, "Ravi", 50000.00);
		int id = obj.getId();
		System.out.println(id);
		String name = obj.getName();
		System.out.println(name);
		double salary = obj.getSalary();
		obj.setSalary(salary);
		System.out.println(salary);

		Car c = new Car();
		c.make = "Suzuki";
		System.out.println(c.make);

	}

}
