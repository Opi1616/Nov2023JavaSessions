package ConstructorAssignment;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		double area = length * width;
		return area;
	}

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2.0, 4.0);
		double area = r2.calculateArea();
		System.out.println(area);

	}

}
