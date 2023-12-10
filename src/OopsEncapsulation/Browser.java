package OopsEncapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser");
		checkBrowserVersion();
		checkOsCompatbility();
		checkRAM();
		checkCPU();
		System.out.println("browser is launched");
	}

	private void checkBrowserVersion() {
		System.out.println("check Browser Version");

	}

	private void checkOsCompatbility() {
		System.out.println("check Os Compatbility");

	}

	private void checkRAM() {
		System.out.println("check RAM");

	}

	private void checkCPU() {
		System.out.println("check CPU");

	}

}
