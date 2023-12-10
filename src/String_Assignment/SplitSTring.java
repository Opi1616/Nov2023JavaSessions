package String_Assignment;

public class SplitSTring {

	public static void main(String[] args) {
		// Write a program that gives you the last half of the string.

		String half = "YogeshDhanokar";
		int len = half.length() / 2;
		String halfString = half.substring(len, half.length());
		System.out.println(halfString);

		// Write a program to get the 3rd  “ e “ of the string

		String occurance = "Welcome to Naveen Automation Labs!";

		System.out.println(occurance.indexOf('e'));
		System.out.println(occurance.indexOf('e', occurance.indexOf('e') + 1));
		

	}

}
