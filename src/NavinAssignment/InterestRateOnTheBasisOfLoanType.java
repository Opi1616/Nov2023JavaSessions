package NavinAssignment;

public class InterestRateOnTheBasisOfLoanType {

	public static void main(String[] args) {
		String Loan_Type = "Home Loan";
		double salary = 35000;
		double interestRate;

		switch (Loan_Type) {

		case "Education Loan":
			interestRate = 6.5;
			break;

		case "Home Loan":
			if (salary < 35000) {
				System.out.println("NOT APPLICABLE FOR Housing Loan");
				return;
			}
			interestRate = 7.5;
			break;
		case "Car Loan":
			interestRate = 10.5;
			break;
		case "Personal Loan":
			interestRate = 11.5;
			break;

		default:
			System.out.println("Please pass the correct loan");
			return;

		}
		System.out.println("Interest rate for " + Loan_Type + " is " + interestRate + "%");

	}

}
