package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSmallModalMain {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/alerts";
		driver.get(URL);

		driver.manage().window().maximize();
		//showSmallModal
		
		WebElement element = driver.findElement(By.id("showSmallModal"));

	}

}
