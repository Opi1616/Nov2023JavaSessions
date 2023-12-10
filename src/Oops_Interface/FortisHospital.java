package Oops_Interface;

public class FortisHospital extends Medical implements UsMedical, UkMedical, IndianMedical {

	int min_fee = 50;

	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
	}

	@Override
	public void DentalServices() {
		System.out.println("FH -- DentalServices");
	}

//UK
	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}

//India
	@Override
	public void oncologyService() {
		System.out.println("FH -- oncologyService");

	}

	@Override
	public void orthoService() {
		System.out.println("FH -- orthoService");

	}

	// Common:
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}

	// individual:

	public void MedicalTraining() {
		System.out.println("FH -- MedicalTraining");

	}

	public void MedicalClaim() {
		System.out.println("FH -- MedicalClaim");

	}

	public void testing() {

	}

	@Override
	public void CovidVaccination() {

		System.out.println("FH -- CovidNews");
	}

	// method hiding
	public static void billing() {
		System.out.println("FH -- billing");
	}

//	@Override
//	public void medicalTest() {
//		System.out.println("FH medical test");
//	}
}
