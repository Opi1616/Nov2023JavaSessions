package String_Assignment;

public class RemoveSpaces {

	public static void main(String[] args) {

		String test = "        Hello  Everyone      ";
		String testOutput = test.replace(" ", "");
		System.out.println(testOutput);

		// Write a program that will print out the last character and first character of
		// a word.
		String name = "Yogesh";

		System.out.println(name.charAt(0));
		System.out.println(name.charAt(5));

		// Write a program to verify a word or a character contained in the sentence.

		String abc = "Hello my name is yogi";

		System.out.println(abc.contains("yogi"));
		// Write a function/ method to reverse your own name.

		String reverseName = ReverseName("Yogesh");
		System.out.println(reverseName);
	}

	public static String ReverseName(String ReverseName) {
		
		String Reverse = "";

		for (int i = ReverseName.length() - 1; i >= 0; i--) {
			Reverse = Reverse + ReverseName.charAt(i);
		}
		return Reverse;
	}

}
