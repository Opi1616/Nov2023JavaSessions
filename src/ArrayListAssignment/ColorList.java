package ArrayListAssignment;

import java.util.ArrayList;

public class ColorList {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("Blue");
		color.add("Red");
		color.add("Yellow");
		color.add("Green");
		color.add("White");
		color.add("Black");
		color.add("Pink");
		color.add("Grey");

		System.out.println(color);

		System.out.println("===========");

		for (String e : color) {
			System.out.println(e);
		}

		System.out.println("===========");

		for (int i = 0; i < color.size(); i++) {
			System.out.println(color.get(i));
		}

		System.out.println("===========");

		String colorName = color.get(4);
		System.out.println(colorName);
		System.out.println("============");
		System.out.println(color);

		color.set(4, "Dark Grey");
		System.out.println(color);

		System.out.println("============");

		color.remove(3);
		System.out.println(color);

		System.out.println("============");
		String searchColor = "Black";
		for (int i = 0; i < color.size(); i++) {
			if (color.get(i).equals(searchColor)) {
				System.out.println("Found " + searchColor);
				break;
			}

		}

	}

}
