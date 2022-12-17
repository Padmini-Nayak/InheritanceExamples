package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateAlertPageMain {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/";
		driver.get(URL);

		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//driver.findElement(By.("Alerts, Frame & Windows")).click();
		List<WebElement> elements = driver.findElements(By.tagName("h5"));
		for (WebElement webElement : elements) {
			if(webElement.getText().equals("Alerts, Frame & Windows")) {
				wait.until(ExpectedConditions.elementToBeClickable(webElement));
				webElement.click();
				break;
			}
			
		}
		
		driver.close();
		//driver.quit();
	}

}
