package NavinAssignment;

public class LoopsAssignment {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 5) {
			System.out.println("I am batman");
			i++;
		}

		System.out.println("==================");

		int j = 1;
		do {

			System.out.println("I am batman " + j);
			j++;
		} while (j <= 9);

		System.out.println("==================");

		int a = 10;
		while (a >= 1) {
			System.out.println(a);
			a--;
		}
		System.out.println("==================");

		int b = 10;
		do {
			System.out.println(b);
			b--;
		} while (b >= 1);

		System.out.println("==================");

		int c = 1;
		while (c <= 10) {
			System.out.println("Hello World");
			c++;
		}
		System.out.println("==================");

		int m = 1;
		int Multiplication = 0;
		while (m <= 100) {
			Multiplication = 5 * m;
			System.out.println("5" + "*" + m + "=" + Multiplication);
			m++;
		}
		System.out.println("==================");
		int Multi = 0;
		for (int p = 1; p <= 100; p++) {
			Multi = 5 * p;
			System.out.println("5" + "*" + p + "=" + Multi);
		}

		System.out.println("==================");
		int Multiply;
		int q = 1;
		do {
			Multiply = 5 * q;
			System.out.println("5" + "*" + q + "=" + Multiply);
			q++;

		} while (q <= 100);
		System.out.println("==================");

		for (int o = 1; o <= 100; o++) {
			if (o % 2 == 0) {
				System.out.println("Even number is: " + o);
			} else if (o % 2 == 1) {
				System.out.println("Odd  number is: " + o);
			}
		}
		System.out.println("==================");

		for (char d = 'A'; d <= 'Z'; d++) {
			System.out.println((int) d);
		}
		System.out.println("==================");
		char z = 'a';
		while (z <= 'z') {
			System.out.println((int) z);
			z++;
		}

		System.out.println("==================");
		for (double decimail = 1.0; decimail <= 10.0; decimail++) {
			System.out.println(decimail);
		}

		System.out.println("==================");

		for (int M = 0; M <= 11; M++) {

			System.out.println(9 * M);
		}

		System.out.println("==================");

		for (char alpha = 'a'; alpha <= 'z'; alpha++) {
			if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
				System.out.println(alpha + " :is vowel");
			}
		}
		System.out.println("==================");
		String Seven = "bye, see you tomorrow";
		for (int n = 1; n <= 10; n++) {
			if (n == 7) {
				System.out.println("bye, see you tomorrow");
				break;
			}
			System.out.println(n);
		}

	}
}
