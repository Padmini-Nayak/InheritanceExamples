package alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DelayedAlertWithFluentWaitMain {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/alerts";
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("timerAlertButton")).click();
		

		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(10))
								.pollingEvery(Duration.ofSeconds(2))
								.ignoring(NoSuchElementException.class).ignoring(NoAlertPresentException.class);
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
		
	}

}
