package insurance.app.test;

public class TestCaseMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		
		TestCase tc = new TestCase();
		
		tc.test(false, "https://demo.guru99.com/insurance/v1/index.php");
	}

}
