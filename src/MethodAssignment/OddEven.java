package MethodAssignment;

import java.util.Scanner;

public class OddEven {

	public boolean oddEvenNumber(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " no is even");
			return true;
		}

		else if (a % 2 == 1) {
			System.out.println(a + " no is odd");
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		OddEven obj = new OddEven();
		boolean b = obj.oddEvenNumber(a);
		System.out.println(b);

	}

}
