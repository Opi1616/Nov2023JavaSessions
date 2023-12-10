package MethodAssignment;

import java.util.Scanner;

public class areaOfCircleRadius {

	public void getCircurenceOfaCircle(double a) {
		double Circumference = 2 * 3.14 * a;
		System.out.println(" If the user pass the  radius of the circle is :" + a + "then find its circumference is: "
				+ Circumference);
	}

	public void getAreaOfaCircle(double a) {
		double Area = 3.14 * a * a;
		System.out.println(" If the user pass the  radius of the circle is :" + a + "then find its Area is: " + Area);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the redius of circle");
		double a = sc.nextDouble();

		areaOfCircleRadius obj = new areaOfCircleRadius();
		obj.getCircurenceOfaCircle(a);
		obj.getAreaOfaCircle(a);

	}

}
