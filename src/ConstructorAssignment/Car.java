package ConstructorAssignment;

public class Car {
	String make;
	String model;
	int year;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;

	}

	public Car() {
		make = "Honda";
		model = "wrv";

	}

	public static void main(String[] args) {
		Car c = new Car("Tata", "Altroz", 2022);
		System.out.println(c.make + " " + c.model + " " + c.year);

		Car c1 = new Car();
		System.out.println(c1.make + " " + c1.model + " " + c.year);

		
		
		
	}

}
