package NavinAssignment;

import java.util.Scanner;

public class VowelCheckUsingSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character ");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'a':
			System.out.println("Vowel a");
			break;
		case 'e':
			System.out.println("Vowel e");
			break;
		case 'o':
			System.out.println("Vowel o");
			break;

		case 'u':
			System.out.println("Vowel u");
			break;
		default:
			System.out.println("Consonant");
		}

	}

}
