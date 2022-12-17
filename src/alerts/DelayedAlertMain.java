package alerts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DelayedAlertMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/alerts";
		driver.get(URL);

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("timerAlertButton"));
		element.click();
		
		// ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		// Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();

		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		alert.accept();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.close();

	}

}
