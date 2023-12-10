package Keyword;

public class billingC extends FinalKeyWord {

	// method hiding: when u have static method in parent class and the same static
	// method in child class.
	// can not be overridden
	public static void billing() {
		System.out.println("billing class---billing ");
	}

	// private final static method can not be overridden
	private void pickColor() {
		System.out.println("billingC -pickColor");
	}

}
