package Oops_Abstraction;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.calculatePageTimeLoadTime();
		lp.forgotPwd();
		Page.footer();
		LoginPage.footer();
		
		System.out.println("------------");
		
		
		//child class object can be referred by parent abstract class reference variable
		//top cast
		Page p = new LoginPage();
		p.title();
		p.url();
		p.calculatePageTimeLoadTime();
		p.displayLogo();
		
		//LoginPage lp1 = new Page();//NA
     		
		
		
		
	}

}
