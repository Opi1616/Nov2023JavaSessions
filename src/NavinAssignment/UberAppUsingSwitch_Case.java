package NavinAssignment;

public class UberAppUsingSwitch_Case {

	public static void main(String[] args) {

		String car_Type = "SUV";

		switch (car_Type) {
		case "Mini":
			System.out.println("Welcome uber You have selected for Mini car");
			break;
		case "Sedan":
			System.out.println("Welcome uber You have selected for Sedan car");
			break;
		case "SUV":
			System.out.println("Welcome uber You have selected for SUV car");
			break;
		case "Premium":
			System.out.println("Welcome uber You have selected for Premium car");
			break;

		default:
			System.out.println("please select the right car type");
			break;
		}

	}

}
