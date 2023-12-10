package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseListGiven {

	public static void main(String[] args) {

		ArrayList<String> NameList = new ArrayList<String>();
		NameList.add("Rohini");
		NameList.add("Veena");
		NameList.add("Megha");
		NameList.add("Pooja");
		NameList.add("Akshya");
		System.out.println(NameList);
		System.out.println("=========");
		Collections.reverse(NameList);
		System.out.println(NameList);
		System.out.println("==================");
		ArrayList<String> Portion = new ArrayList<>(NameList.subList(1, 4));
		System.out.println(Portion);

		// NameList.clear();
		System.out.println(NameList);
		System.out.println("===========");

		System.out.println(NameList.size());

		System.out.println("===========");
		// to trim the virtual capacity of an array list the current list size.
		NameList.trimToSize();

		System.out.println(NameList.size());
		
		System.out.println("===========");
		
		for (int i = 0; i < NameList.size(); i++) {
			System.out.println("Element at index " + i + " is " + NameList.get(i));
		}

	}

}
