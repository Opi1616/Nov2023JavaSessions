package JavaSession23;

public class LoopsConcept {

	public static void main(String[] args) {
		// 1to10:
		// 1.while
		int i = 1;
		while (i <= 10) {
			System.out.println(i);// 1to10
			i++;
		}
		System.out.println("====================");
		int k = 1;
		while (true) {
			System.out.println("welcome to taz");

			if (k == 5) {

				break;
			}
			k++;

		}
		System.out.println("====================");
		// for loop:
		// 1to 10:
		// for(initialize; condition;increment/decrement)
		int j = 1;
		for (; j <= 10;) {
			System.out.println(j);
			j++;
		}
		System.out.println("====================");
		int c = 1;
		for (; true;) {
			System.out.println("welcome to naveen automation labs");
			if (c == 5) {
				break;
			}
			c++;
		}
		System.out.println("====================");
		int p;
		for (p = 1; p <= 10; p++) {
			System.out.println(p);
		}
		System.out.println("====================");
		// a to z with ASCII
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + "=" + (int) ch);
		}
		System.out.println("====================");
		// A to Z with ASCII
		for (char cha = 'A'; cha <= 'Z'; cha++) {
			System.out.println(cha + "=" + (int) cha);
		}
		System.out.println("====================");
		// print a to z

		for (char L = 'a'; L <= 'z'; L++) {
			System.out.println(L);
		}
		System.out.println("====================");
		// print A to Z
		for (char N = 'A'; N <= 'Z'; N++) {
			System.out.println(N);
		}

		System.out.println("====================");

		for (double d = 1.1; d <= 5.1; d++) {
			System.out.println(d);
		}

		System.out.println("====================");

		for (int w = 1; w <= 100; w++) {
			if (w % 2 == 0) {
				System.out.println(w);
			}
		}
		System.out.println("====================");

		// use cases of while loop:
		// when number of iterations are not fixed --while loop
		// total links/images on the page
		// web table pagination 1 2 3 4..next
		// web element is loading on the page
		// page load time out
		// Calendar:
		// build is running :10,1hr,2hr,30 min

		// use cases of for loop:
		// when number of iterations are fixed --for loop
		// month /days drop down -->1to 12
		// category options-->
		// Arrays , ArrayList
		// excel file ---test data --rows =1 to rowSize()
		// country drop down -->1 to 230--> if name = brazil --break;
		// read data: JSON/XML
		// read data from DB: SQL --rows/colns

		// do-while loop:

		int e = 1;
		do {
			System.out.println(e);
			e++;

		} while (e <= 10);

		// use cases:
		// 1.web table pagination: check if element is already present in the table,
		// click on it and end the loop
		// 2.go and check the element first and then start the while loop
		// 3.calendar:

	}

}
