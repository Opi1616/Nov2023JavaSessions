package MethodAssignment;

import java.util.Scanner;

public class enterTwoNumber {

	public void showTwoNumbers(double a, double b) {
		System.out.println("a =" + a);
		System.out.println("b =" + b);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		double a = sc.nextDouble();
		System.out.println("enter b no");
		double b = sc.nextDouble();

		enterTwoNumber etn = new enterTwoNumber();
		etn.showTwoNumbers(a, b);

	}

}
