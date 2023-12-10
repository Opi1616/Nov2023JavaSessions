package Encapsulation_Assignment;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setAccountNo("123456");
		ba.setBalance(500.01);
		ba.setOwner("Rohit");
		ba.deposit(537.11);
		ba.Withdraw(1035.22);
		ba.printstatement();
		

	}

}
