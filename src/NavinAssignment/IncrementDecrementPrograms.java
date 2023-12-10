package NavinAssignment;

public class IncrementDecrementPrograms {

	public static void main(String[] args) {

		int i = 11;
		i = i++ + ++i;
		System.out.println(i);

		System.out.println("==============");

		int a = 11;
		int b = 22;
		int c = a + b + a++ + b++ + ++a + ++b;
		System.out.println(c);

		System.out.println("==============");

		int p = 0;
		p = p++ - --p + ++p - p--;
		System.out.println(p);

		System.out.println("==============");

		int l = 1, j = 2, k = 3;

		int m = l-- - j-- - k--;

		System.out.println("l=" + l);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
		System.out.println("m=" + m);

		System.out.println("==============");

		int x = 1, y = 2;
		System.out.println(--y - ++x + ++y - --x);
		System.out.println("==============");

		int ch = 'a';
		System.out.println(ch++);
		System.out.println("==============");

		char cha = 'A';
		System.out.println(++cha);
		System.out.println("==============");
		
		double Q=1.5, q=2.5;
		System.out.println(Q++ + q++);
		System.out.println("==============");
		
		
		

	}

}
