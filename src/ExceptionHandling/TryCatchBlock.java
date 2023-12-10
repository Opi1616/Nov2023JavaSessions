package ExceptionHandling;

public class TryCatchBlock {
	int age;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		TryCatchBlock obj = new TryCatchBlock();
		obj = null;
		try {
			obj.age = 20;// NPE
		} catch (Exception e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		try {
			int i = 9 / 0; // Run time exception / unchecked exception
			System.out.println("hello");
		} catch (Throwable e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}

		System.out.println("Bye");
	}

}
