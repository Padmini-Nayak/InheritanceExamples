package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/alerts";
		driver.get(URL);

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("confirmButton"));
		Thread.sleep(2000);

		element.click();

		Thread.sleep(2000);

		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);

		driver.close();

	}

}
