package Encapsulation_Assignment;

public class BankAccount {
	private String accountNo;
	private double balance;
	private String owner;

	public void deposit(double cashDeposit) {
		System.out.println("Before deposit Balance is: " + balance);
		balance = cashDeposit + balance;
		System.out.println("after deposit: " + cashDeposit + " Then balance is: " + balance);
	}

	public void Withdraw(double cashWithdraw) {
		System.out.println("Before Withdraw Balance is: " + balance);
		if (balance >= cashWithdraw) {
			balance = balance - cashWithdraw;
			System.out.println("after Withdraw: " + cashWithdraw + " Then balance is: " + balance);
		}
		else {
			System.err.println("Insufficient fund");
		}
	}

	public void printstatement() {
		System.out.println(accountNo);
		System.out.println(balance);
		System.out.println(owner);
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
