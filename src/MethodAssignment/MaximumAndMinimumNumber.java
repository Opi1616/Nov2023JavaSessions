package MethodAssignment;

import java.util.Scanner;

public class MaximumAndMinimumNumber {

	public void maximumNumber(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			System.out.println("a is max: " + a);
		} else if ((b > a) && (b > c)) {
			System.out.println("b is max: " + b);
		} else if ((c > a) && (c > b)) {
			System.out.println("c is max: " + c);
		}

	}

	public void minimumNumber(int a, int b, int c) {
		if ((a < b) && (a < c)) {
			System.out.println("a is minimum: " + a);
		} else if ((b < a) && (b < c)) {
			System.out.println("b is minimum: " + b);
		} else if ((c < a) && (c < b)) {
			System.out.println("c is minimum: " + c);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st no");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd no");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd no");
		int c = sc.nextInt();

		MaximumAndMinimumNumber obj = new MaximumAndMinimumNumber();
		obj.maximumNumber(a, b, c);
		obj.minimumNumber(a, b, c);

	}

}
