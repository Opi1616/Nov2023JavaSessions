package Oops_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.DentalServices();
		fh.emergencyServices();
		fh.pediaServices();
		fh.neuroServices();
		fh.MedicalClaim();
		fh.MedicalTraining();
		fh.medicalRD();
		System.out.println(fh.min_fee);
		System.out.println("-----------------");
		// top casting: child class object can be referred by parent interface ref
		// variable:
		UsMedical us = new FortisHospital();
		us.physioServices();
		us.DentalServices();
		us.cardioServices();
		us.emergencyServices();
		us.medicalTest();
		System.out.println("-----------------");
		// Top Casting with grand parent

		WHO wh = new FortisHospital();
		wh.CovidVaccination();

		// down casting:NA

		// calling static method
		UsMedical.billing();
		FortisHospital.billing();
		fh.medicalTest();

		System.out.println(UsMedical.min_Fee);
		// UsMedical.min_Fee=100;

		System.out.println(UsMedical.isApproved);

	}

}
