package Oops_Interface;

public interface UsMedical extends WHO {

	// static and final in nature(by default)
	int min_Fee = 10;
	boolean isApproved = true;

//abstract method: 
//no method
//only method declaration/method prototype / no business logic
//can not create the object of interface
	// C-C: extends
	// C-I: implements
	// I-I: extends
	// I-C: extends
//abstract methods: 100% abstraction -- oop
	public void physioServices();

	public void cardioServices();

	public void DentalServices();

	public void emergencyServices();

	// after jdk 1.8 :
	// 1.we can have static method with method body:

	public static void billing() {
		System.out.println("US Medical -- billing");
	}

	// 2.default method with method body:
	default void medicalTest() {
		System.out.println("US medical test");
	}

	default void medicalReport() {
		System.out.println("US medical Report");
	}

}
