package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/alerts";
		driver.get(URL);

		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("alertButton"));
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		element.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.close();

	}

}
