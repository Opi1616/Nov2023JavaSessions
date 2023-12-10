package webdriver_Architecture;

public class AmazonTest {

	public static void main(String[] args) {

		// chrome:
		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		String browser = "safari";
		WebDriver driver = null;
		//Cross browser logic:
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Plzz pass the right browser.......");
		}

		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement("emailId");
		driver.sendKeys("emailId", "naveen@gmail.com");
		driver.findElement("password");
		driver.sendKeys("password", "naveen123");
		driver.findElement("loginButton");
		driver.click("loginButton");
		driver.close();

	}

}
