package OopsInterfaceAssignment;

public class Institute extends EducationAct implements UsEducation, UkEducation, IndianEducation {
//IndianEducation: 
	@Override
	public void MBA() {
		System.out.println("Institute --MBA");

	}

	@Override
	public void MCA() {
		System.out.println("Institute --MCA");

	}

	@Override
	public void MCOM() {
		System.out.println("Institute --MCOM");

	}

	// UkEducation:
	@Override
	public void BBM() {
		System.out.println("Institute --BBM");
	}

	@Override
	public void BCOM() {
		System.out.println("Institute --BCOM");

	}

	@Override
	public void BA() {
		System.out.println("Institute --BA");

	}

//UsEducation: 
	@Override
	public void BCA() {
		System.out.println("Institute --BCA");

	}

	@Override
	public void BSC() {
		System.out.println("Institute --BSC");

	}

	@Override
	public void BCS() {
		System.out.println("Institute --BCS");
	}

	// individual:

	public void admission() {
		System.out.println("Institute --admission");
	}

	public void CourseFees() {
		System.out.println("Institute --CourseFees");
	}

	// Common:
	@Override
	public void AdministrationFees() {
		System.out.println("Institute --AdministrationFees");

	}

	@Override
	public void AllCourses() {
		System.out.println("Institute --AllCourses");

	}

}
