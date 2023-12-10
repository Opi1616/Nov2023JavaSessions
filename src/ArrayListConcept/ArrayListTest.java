package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("Testing");
		ar.add('h');
		ar.add(true);
		
		for(Object e: ar) {
			System.out.println(e);
		}

	}

}
