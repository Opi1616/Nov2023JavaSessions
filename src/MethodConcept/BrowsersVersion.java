package MethodConcept;

public class BrowsersVersion {

	String name;
	static String hq = "Banglore";

	public int getBrowserVersion() {
		System.out.println("get browser version");
		return 100;
	}

	public static String getBrowserVendor() {
		System.out.println("get browser version");
		return "Mozilla";
	}

	//entry point of execution
	//runner method
	//calling method
	//like a user for me	
	public static void main(String[] args) {
		BrowsersVersion obj = new BrowsersVersion();
		System.out.println(obj.name);
		System.out.println(hq);// directly call
		System.out.println(BrowsersVersion.hq);
		obj.getBrowserVersion();
		getBrowserVendor();
		BrowsersVersion.getBrowserVendor();

		obj.name = "naveen";
		obj.hq = "Pune";
		obj.getBrowserVendor();

		// object can not hold static properties (var,method)
		// static will be stored in CMA - Perm Gen - Metaspace
		// Object can call/access static properties but with a warning
		// you should always call static with the class name.
		// 10 objects---> static copies=1
		// non static copies =10

	}

}
