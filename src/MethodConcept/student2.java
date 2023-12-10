package MethodConcept;

public class student2 {
	
	public int getStudentMarks(String studentName) {
		
		System.out.println("getting marks for: "+studentName);
		int marks=-1;
		switch (studentName) {
		case "Riya":
			marks=90;
			break;
		case "Vikash":
			marks=80;
			break;	
		case "Neetu":
			marks=100;
			break;	
		case "Naveen":
			marks=10;
			break;		

		default:
			System.out.println("no student found...pls pass the right sudent name... " + studentName);
			break;
			
		}
		return marks;
	
	}

	public static void main(String[] args) {
		student2 s1 = new student2();
		int m1 =s1.getStudentMarks("Neetu");
		System.out.println(m1);
		if(m1>=0) {
			System.out.println("Get mark sheet");
		}
		System.out.println("=======================");
		int m2 =s1.getStudentMarks("Rohit");
		System.out.println(m2);
	}

}
