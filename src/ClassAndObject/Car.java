package ClassAndObject;

public class Car {

	String name;
	String color;
	int price;
	final static int wheels = 4;

	// static is the common prop for all the objects
	// but obj will not hold the static property
	// static var will be stored in CMA
	// and it will create only one copy for all the objects

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.color = "White";
		c1.price = 80;

		// how to access the static variable;
		// using the class name;
		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + Car.wheels);
		System.out.println(c1.wheels);// not a right way of calling static var using ref name;
		System.out.println(wheels);

		Car c2 = new Car();
		c2.name = "Audi";
		c2.color = "Red";
		c2.price = 70;
		System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + Car.wheels);

		Car c3 = new Car();
		c3.name = "Honda";
		c3.color = "Black";
		c3.price = 20;
		System.out.println(c3.name + " " + c3.color + " " + c3.price + " " + Car.wheels);
	}

}
