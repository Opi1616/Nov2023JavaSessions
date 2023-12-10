package ArrayConcept;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		
		//2. Array Literals
		
		int a[]= {1,2,3,4,55,23,12,101};
		
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		
		double d[]= {1.1,2.3,4.5,5.6};
		char voweles[]= {'a','e','o','u'};
		
		String browsers[] = {"chrome","firefox","IE","Edge","safari"};
		for(int k=0;k<browsers.length;k++) {
			System.out.println(browsers[k]);
			if(browsers[k].equals("IE")) {
				System.out.println("this is deprecated");
			}
		}
		
		int ar[]= new int[4];
		ar[0]= 100;
		ar[4]=250;//ArrayIndexOutOfBoundsException
	//System.out.println(ar[4]);

	}

}
