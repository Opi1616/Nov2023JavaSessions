package StackMemory;

public class Assignment {

	// 3 static
	// 3 non static
	// static --static
	// static-no static
	// non static -static
	// non static-non static

	public static void M1() {
		System.out.println("M1 Method");
		M2();
	}

	public static void M2() {
		System.out.println("M2 Method");
		M3();
	}

	public static void M3() {
		System.out.println("M3 Method");
		Assignment as = new Assignment();
		as.P1();
	}

	public void P1() {
		System.out.println("P1 Method");
		M1();
	}

	public void P2() {
		System.out.println("P2 Method");
		P3();
	}

	public void P3() {
		System.out.println("P3 Method");
	}

	public static void main(String[] args) {
		Assignment as = new Assignment();
		as.P1();
	}

}
