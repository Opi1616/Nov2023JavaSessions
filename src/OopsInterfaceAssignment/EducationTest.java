package OopsInterfaceAssignment;

public class EducationTest {

	public static void main(String[] args) {
		Institute ie = new Institute();

		ie.BCA();
		ie.BA();
		ie.BBM();
		ie.BCOM();
		ie.BCS();
		ie.BSC();
		ie.MBA();
		ie.MCA();
		ie.MCOM();
		ie.AdministrationFees();
		ie.admission();
		ie.EducationalRD();

		System.out.println("-----------------");
		// top casting: child class object can be referred by parent interface ref
		// variable:

		UsEducation us = new Institute();
		us.AdministrationFees();
		us.BCA();
		us.BCS();
		us.BSC();

		System.out.println("-----------------");

		// Top Casting with grand parent

		GlobalEducation ge = new Institute();
		ge.AllCourses();

		// down casting:NA

	}

}
