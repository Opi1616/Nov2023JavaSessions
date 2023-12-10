package MethodConcept;

public class Student {

	// WAF
	// create a method -- getStudentMarks
	// pass a parameter: studentName
	// return the student marks -->int

	public int getStudentMarks(String studentName) {

		System.out.println("getting marks for: " + studentName);
		int marks = -1;

		if (studentName.equalsIgnoreCase("Riya")) {
			marks = 90;
		} else if (studentName.equalsIgnoreCase("Vikash")) {
			marks = 80;
		} else if (studentName.equalsIgnoreCase("Neetu")) {
			marks = 100;
		} else if (studentName.equalsIgnoreCase("Naveen")) {
			marks = 10;
		} else {
			System.out.println("no student found...pls pass the right sudent name... " + studentName);
		}
		return marks;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		int m1 = s1.getStudentMarks("riya");
		System.out.println(m1);
		int m2 = s1.getStudentMarks("naveen");
		System.out.println(m2 + 60);
		if (m2 >= 0) {
			System.out.println("print the mark sheet");
		}
		int m3 = s1.getStudentMarks("Tom");
		System.out.println(m3);// -1

		if (m3 >= 0) {
			System.out.println("print the mark sheet");
		}
	}

}
