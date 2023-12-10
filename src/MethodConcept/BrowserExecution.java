package MethodConcept;

import java.util.ArrayList;

public class BrowserExecution {

	public boolean launchBrowser(String browserName) {
		System.out.println("browser name: " + browserName);
		boolean flag = true;

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		default:
			System.out.println("plz pass the right browser..." + browserName);
			flag = false;
			break;
		}
		return flag;
	}

	public void testing() {
		System.out.println("testingn method");
		// return;
	}

	// WAF:
	// supply input param: Company Name (String): IBM, MS, Google
	// return: the list of employee of the comp: ArrayList<String>

	public ArrayList<String> getEmpList(String compName) {
		System.out.println("company name is : " + compName);

		ArrayList<String> empList = new ArrayList<String>();// pc=0
		if (compName.equalsIgnoreCase("IBM")) {
			empList.add("Rakesh");
			empList.add("Ravi");
			empList.add("Geeta");
		} else if (compName.equalsIgnoreCase("MS")) {
			empList.add("Abhi");
			empList.add("Naveen");
			empList.add("Heena");
			empList.add("Azam");
		}

		else if (compName.equalsIgnoreCase("Google")) {
			empList.add("Fawad");
			empList.add("Dhurv");
		} else {
			System.out.println("Comp name is found...plzpass the right comp name");
		}
		return empList;

	}

	public static void main(String[] args) {
		BrowserExecution b = new BrowserExecution();
		boolean isLaunched = b.launchBrowser("Chrome");
		if (isLaunched) {
			System.out.println("enter the url.....");
		} else {
			System.out.println("dont enter the url");
		}

		System.out.println("=================");
		ArrayList<String> googleList = b.getEmpList("Google");
		System.out.println(googleList);

		ArrayList<String> ibmList = b.getEmpList("IBM");
		System.out.println(ibmList);

		ArrayList<String> CTSList = b.getEmpList("CTS");
		System.out.println(CTSList);

		ArrayList<String> MSList = b.getEmpList("MS");
		System.out.println(MSList);

	}

}
