package NavinAssignment;

public class LaunchBrowser {

	public static void main(String[] args) {

		String Browser = "Safari";

		if (Browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Launch Chrome");
		} else if (Browser.equalsIgnoreCase("Safari")) {
			System.out.println("Launch Safari");
		} else if (Browser.equalsIgnoreCase("Opera")) {
			System.out.println("Launch Opera");
		} else if (Browser.equalsIgnoreCase("IE")) {
			System.out.println("Launch IE");
		} else {
			System.out.println("please pass the right browser name");
		}

		switch (Browser) {
		case "Chrome":
			System.out.println("Launch Chrome");
			break;
		case "Safari":
			System.out.println("Launch Safari");
			break;

		case "Opera":
			System.out.println("Launch Opera");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;
		default:
			System.out.println("please pass the right browser name");
			break;
		}

	}

}
