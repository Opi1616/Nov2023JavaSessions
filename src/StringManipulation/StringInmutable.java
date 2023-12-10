package StringManipulation;

public class StringInmutable {

	public static void main(String[] args) {

		String s = "Selenium";

		String t = s + "Hello";
		System.out.println(t);
		System.out.println(s);

		String st = "java";
		System.out.println(st + "Python");

		System.out.println(st);

		st = st + "Automation";
		System.out.println(st);// JavaAutomation

		String u = "Java";

		// mutable classes:
		// StringBuilder(1.5) and StringBuffer(1.0):

		StringBuilder sb = new StringBuilder("Testing");
		sb.append("Automation");
		System.out.println(sb);

		String pop = "         sumit       ";
		pop = pop.trim();
		System.out.println(pop);

	}

}
