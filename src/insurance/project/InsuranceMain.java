package insurance.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsuranceMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		LaunchPage launch = new LaunchPage();
		Register register = new Register();
		Login login = new Login();
		
		//Launch the website
		launch.launch(driver);
		Thread.sleep(2000);
		
		//Register the user
		register.register(driver);
		Thread.sleep(2000);
		
		//Log in with valid credentials
		login.logIn(driver);
		Thread.sleep(2000);
		
		driver.quit();

	}

}
