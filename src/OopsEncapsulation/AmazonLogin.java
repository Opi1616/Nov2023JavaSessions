package OopsEncapsulation;

public class AmazonLogin {

	public static void main(String[] args) {

		// registration:
		LoginPage lp = new LoginPage("Pooja@gmail.com", "Pooja@123");

		// login:
		lp.doLogin(lp.getUserName(), lp.getPassword());

		System.out.println("------------------");

		// reset pwd:
		lp.setPassword("pooja@456");
		lp.doLogin(lp.getUserName(), lp.getPassword());

		System.out.println("------------------");

		// abhishek -seller
		LoginPage lp1 = new LoginPage("Abjiseller@gmail.com", "Abhi@123");

		// login:
		lp1.doLogin(lp1.getUserName(), lp1.getPassword());

	}

}
