package JavaSession23;

public class IncrementAssignment {

	public static void main(String[] args) {

		int a = 1;
		int b = a++ + ++a*--a-a--;
		System.out.println(b);
		System.out.println(a);

	}

}
