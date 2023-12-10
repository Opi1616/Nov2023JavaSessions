package MethodAssignment;

import java.util.Scanner;

public class calculator {

	public int additionOfTwoNumbers(int a, int b) {
		System.out.print(a + "+" + b + "=");
		int c = a + b;
		return c;
	}

	public int multiplicationOfTwoNumbers(int a, int b) {
		System.out.print(a + "*" + b + "=");
		int c = a * b;
		return c;
	}

	public int divisionOfTwoNumbers(int a, int b) {
		System.out.print(a + "/" + b + "=");
		int c = a / b;
		return c;
	}

	public int subtractionOfTwoNumbers(int a, int b) {
		System.out.print(a + "-" + b + "=");
		int c = a - b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no: ");
		int a = sc.nextInt();
		System.out.println("enter b no: ");
		int b = sc.nextInt();

		calculator obj = new calculator();

		int c = obj.additionOfTwoNumbers(a, b);
		System.out.println(c);
		
		int m = obj.multiplicationOfTwoNumbers(a, b);
		System.out.println(m);

		int d = obj.divisionOfTwoNumbers(a, b);
		System.out.println(d);
		
		int s = obj.subtractionOfTwoNumbers(a, b);
		System.out.println(s);

	}

}
