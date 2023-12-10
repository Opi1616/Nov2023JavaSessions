package Opps_Inheritance;

public class BMW extends Car {

	// Method Overriding: Poly + Morphism --> Run Time (Dynamic)
	// when you have a method in parent class and the same method in child class:
	// with the same name
	// with the same number of parameters
	// with the same sequence of parameters
	// with the same return
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	@Override
	public void petrolEngine() {
		System.out.println("BMW -- petrol Engine");

	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	public void theSafety() {
		System.out.println("BMW --theSafety");
	}
	
	public void test(int i, int j) {
		
	}

}
