package NavinAssignment;

public class GreatestNumberFrom4Numbers {

	public static void main(String[] args) {

		int a = 25, b = 78, c = 27, d = 97;

		if (a > b && a > c && a > d) {
			System.out.println(a + " is greatest");
		}

		else if (b > a && b > c && b > d) {
			System.out.println(b + " is greatest");
		} else if (c > a && c > b && c > d) {
			System.out.println(c + " is greatest");
		} else if (d > a && d > c && d > b) {
			System.out.println(d + " is greatest");
		}

	}

}
