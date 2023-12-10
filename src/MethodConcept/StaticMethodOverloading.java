package MethodConcept;

public class StaticMethodOverloading {

	public static void login() {

	}

	public static void login(int i) {

	}

	public static void login(int i, int j) {

	}

	//src code (.java) -compiler Time-->.class (deccision of method calling)--> JVM -->Run it -->machine code (os) 
	public static void main(String[] args) {
		System.out.println("main method");
		StaticMethodOverloading.main(10);
		StaticMethodOverloading.main(10, 20);
	}
	
	public static void main() {
		System.out.println("main method without any value");
	}

	public static void main(int a) {
		System.out.println("main method" + a);
	}

	public static void main(int a, int b) {
		System.out.println("main method" + a + b);
	}
	
	public static void main(String a[], int b) {
		System.out.println("main method" + a);
	}

}
