package Oops_Abstraction;

public abstract class Page {

	// can not create the object of abstract class
	// but can create the constructor of abstract class
	// and this constructor will be called when we create the object of child class

	//100% abstraction
	//0% abstraction
	//partial abstraction 
	public Page() {
		System.out.println("page constructor");
	}

	public Page(int i) {
		System.out.println("one param page constructor" + i);
	}

	public abstract void title();

	public abstract void url();

	public void calculatePageTimeLoadTime() {
		System.out.println("page time out -- 10 secs");
	}

	public final void displayLogo() {
		System.out.println("display Logo");
	}

	public static void footer() {
		System.out.println("page footer");
	}

}
