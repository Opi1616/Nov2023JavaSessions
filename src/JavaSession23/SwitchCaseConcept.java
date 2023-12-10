package JavaSession23;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("please pass the correct browser");
			break;
		}

	}

}
