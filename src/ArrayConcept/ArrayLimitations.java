package ArrayConcept;

import java.util.Arrays;

public class ArrayLimitations {

	public static void main(String[] args) {

		int product[] = new int[50];

		// limitations of array:
		// 1.size is fixed: static array: to overcome this problem, we need to use
		// dynamic array - ArrayList will be used
		// 2. similar type of data: to overcome this, we can use object array.

		// object is the class java

		Object emp[] = new Object[5];// 0-4
		emp[0] = "Tom";
		emp[1] = 30;
		emp[2] = 23.33;
		emp[3] = 'm';
		emp[4] = true;

		System.out.println(Arrays.toString(emp));
		System.out.println("=============");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
		System.out.println("=============");
		
		//static array ex: 
		//1.bookmyshow.com--> 200
		//2.flight/bus booking --->100
		//3.ecomm-->category
		//4.country drop down --> 232
	}
}
