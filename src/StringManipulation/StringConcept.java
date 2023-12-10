package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "hello";

		System.out.println(s == s1);
		System.out.println(s1 == s2);

		// String objects with new keyword
		String st = new String("Java");
		String st1 = new String("Hello");

		System.out.println(s == st1);// false
		System.out.println(s.equals(st1));// true

		String st2 = new String("Java");

		String test = new String("Selenium");// 1 -->HEAP
		test.intern();// 1
		String t1 = "Selenium";// 0

		// total objects =2

		String st4 = new String();
		System.out.println(st4.length());

	}

}
