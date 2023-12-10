package Oops_Abstraction;

public class LoginPage extends Page {

	// hidden default constructor
//	public LoginPage() {
//		System.out.println("Lp -- constructor...");
//	}

//	public LoginPage(int i) {
//		System.out.println("Lp -- constructor..." + i);
//	}

	@Override
	public void title() {
		System.out.println("login title");
	}

	@Override
	public void url() {
		System.out.println("https://www.abc.com/login.html");
	}

	@Override
	public void calculatePageTimeLoadTime() {
		System.out.println("page time out -- 10 secs");
	}

	public void forgotPwd() {
		System.out.println("forgotPwd");
	}

}
