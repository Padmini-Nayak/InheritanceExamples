package screenshotExample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Utility;

public class TestScreenShotMain {
	
	public static void main(String args[]) {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://www.google.com";
		driver.get(URL);

		driver.manage().window().maximize();
		
		try {
			Utility.takeScreenShot(driver, "C://ss.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
