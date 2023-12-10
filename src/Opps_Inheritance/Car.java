package Opps_Inheritance;

public class Car extends Vehicle {

	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}

	@Override
	public void petrolEngine() {
		System.out.println("Car -- petrol engine ");
	}

	public void test(int i, int j) {

	}

//	
}
