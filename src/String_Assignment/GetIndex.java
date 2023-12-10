package String_Assignment;

public class GetIndex {

	public static int getIndex(String abc) {
		if (abc.length() >= 1) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int number = getIndex("");
		System.out.println(number);
	}

}
