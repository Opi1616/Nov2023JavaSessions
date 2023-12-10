package JavaSession23;

public class TimeComplexity {

	public static void main(String[] args) {

		int i = 1;
		System.out.println(i);

		// constant time: Big 0(1)

		String name = "Tom";
		System.out.println(name);
		int n = 100;
		for (int p = 1; p <= n; p++) {
			System.out.println(p);
			System.out.println(p + 10);

		}
		System.out.println("===============");
		// 1 + n + n + n ==> 3n+1 --> linear equation
		// 3n+1-->3n-->0(n)

		byte b1 = 10;
		byte b2 = 90;
		int b3 = b1 + b2;
		System.out.println(b3);
		System.out.println("===============");

		byte b4 = (byte) (b1 + b2);
		System.out.println(b4);
		System.out.println("===============");

		for (int o = 0; o <= 3; o++) {

			for (int p = 0; p <= 4; p++) {
				System.out.print(o + "" + p + " ");
			}
			System.out.println();

		}
		System.out.println("===============");

		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println(ch + "=" + (byte) ch);
		}
		System.out.println("===============");

	}

}
