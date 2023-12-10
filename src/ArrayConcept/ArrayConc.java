package ArrayConcept;

import java.util.Arrays;

public class ArrayConc {

	public static void main(String[] args) {
		
		//limitation of array:
		// size is fixed

		// 1.with new keyword
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		System.out.println(a[0]);
		System.out.println(a[3]);
		// System.out.println(a[4]);//ArrayIndexOutOfBoundsException
		// System.out.println(a[-1]);//ArrayIndexOutOfBoundsException

		int length = a.length;
		System.out.println(length);
		int highest_length = length - 1;
		System.out.println(highest_length);
		int lowest_length = 0;
		System.out.println(lowest_length);
		System.out.println("=========");
		// to print all the values from the array:use for loop

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("=========");
		// without using for loop:
		System.out.println(a);
		System.out.println("=========");

		System.out.println(Arrays.toString(a));

		System.out.println("=========");

		// using for each loop:

		for (int e : a) {
			System.out.println(e);
		}

		System.out.println("=========");

		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 34.44;
		System.out.println(d[0] + d[1]);

		System.out.println("=========");

		// String array:
		String emp[] = new String[3];// 0-2
		emp[0] = "Pooja";
		emp[1] = "Ravi";
		emp[2] = "Robin";

		System.out.println("total emp: " + emp.length);
		System.out.println(Arrays.toString(emp));

		System.out.println("=========");

		for (int k = 0; k < emp.length; k++) {
			System.out.println(emp[k]);
			if (emp[k].equals("Ravi")) {
				System.out.println("ravi salary is: " + 1000);
				break;
			}
		}
		System.out.println("=========");
		for (String e : emp) {
			System.out.println(e);
		}
		
		//static array ex:
		//month/days
		//200 movie tickets
		

	}

}
