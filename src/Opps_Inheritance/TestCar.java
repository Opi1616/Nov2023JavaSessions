package Opps_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();// Overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking();// Individual
		b.engine();// inherited
		b.petrolEngine();// Overridden
		b.theSafety();// Individual

		System.out.println("---------------");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.petrolEngine();

		System.out.println("---------------");

		// child class object can be referred by parent class ref variable:
		// Top/Up casting: can access only overridden and inherited methods
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		// c1.autoParking();//not allowed for individual methods --ref type check is
		// failed
		System.out.println("---------------------");
		// child class object can be referred by parent class ref variable:
		Vehicle v1 = new BMW();
		v1.engine();
		v1.petrolEngine();
		System.out.println("---------------------");
		// down casting:
		// parent class object can be referred by child class reference variable

		//BMW b1 = (BMW) new Car();// ClassCastException
		System.out.println("---------------------");
	}

}
