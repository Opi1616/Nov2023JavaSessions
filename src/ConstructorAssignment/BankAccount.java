package ConstructorAssignment;

public class BankAccount {

	String accountNumber;
	double balance;
	double newBalance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println("Account balance is: " + balance);
	}

	public void deposit(double BalanceAdd) {

		balance = balance + BalanceAdd;
		System.out.println(
				"adding some amount is: " + BalanceAdd + " " + "after adding amount total balance is: " + balance);

	}

	public void withdraw(double lessBalance) {

		if (lessBalance <= balance) {
			balance = balance - lessBalance;
			System.out.println(
					"withdraw some amount from balance: " + lessBalance + "After withdraw balance is: " + balance);
		} else {
			System.err.println("Insufficient funds");
		}

	}

	public static void main(String[] args) {

		BankAccount obj = new BankAccount("23456789", 200);
		obj.deposit(500);
		obj.withdraw(300);
		obj.deposit(200);
		obj.withdraw(400);

	}

}
