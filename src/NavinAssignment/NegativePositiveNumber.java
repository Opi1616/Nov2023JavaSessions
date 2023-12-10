package NavinAssignment;

import java.util.Scanner;

public class NegativePositiveNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		if (n >= 0) {
			System.out.println(n + " number is positive");
		} else if (n <= 0) {
			System.out.println(n + " number is negative");
		}

	}

}
