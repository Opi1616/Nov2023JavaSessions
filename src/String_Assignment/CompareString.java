package String_Assignment;

public class CompareString {

	public static void main(String[] args) {

		String s1 = "Geeksfor";
		String s2 = "GeeksFor";

		System.out.println(s1 == s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.contains("eks"));

	}

}
