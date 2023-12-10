package String_Assignment;

public class PrintMiddleWord {

	public static void main(String[] args) {
		// Assume that a string consists of 3 words, print out the middle one. 

		String name = "Yogesh Narayan Dhanokar";
		String[] middleNAme = name.split(" ");
		System.out.println(middleNAme[1]);

		// get only numeric part from this String:

		String splitString = "your transaction id is: 1111 and reference id is 2222";
		int addition = 0;

		for (int i = 0; i < splitString.length(); i++) {
			char ch = splitString.charAt(i);
			if (Character.isDigit(ch)) {
				System.out.print(ch + " ");

				int digit = Integer.parseInt(String.valueOf(ch));

				addition = addition + digit;

			}

		}
		System.out.println("addition of all number is:  " + addition);

	}
}
