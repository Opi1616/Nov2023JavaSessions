package MethodAssignment;

public class MarkSheet {

	public void getGrade(int marks) {
		if ((marks >= 91) && (marks <= 100)) {
			System.out.println("A+ GRADE");
		} else if ((marks >= 81) && (marks <= 90)) {
			System.out.println("A GRADE");
		} else if ((marks >= 71) && (marks <= 80)) {
			System.out.println("B GRADE");
		} else if ((marks >= 61) && (marks <= 70)) {
			System.out.println("B+ GRADE");
		} else if ((marks >= 51) && (marks <= 60)) {
			System.out.println("C GRADE");
		} else if ((marks >= 41) && (marks <= 50)) {
			System.out.println("D GRADE");
		} else if (marks <= 40) {
			System.out.println("FAIL");
		}

	}

	public static void main(String[] args) {
		
		MarkSheet obj = new MarkSheet();
		obj.getGrade(77);

	}

}
