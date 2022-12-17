package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/alerts";
		driver.get(URL);

		driver.manage().window().maximize();
		
		WebElement promptElement = driver.findElement(By.id("promtButton"));
		promptElement.click();
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].click()", promptElement);
		
		Alert promptText = driver.switchTo().alert();
		String alertText = promptText.getText();
		System.out.println("The alert text is "+alertText);
		Thread.sleep(3000);
		promptText.sendKeys("user001");
		
		Thread.sleep(2000);
		promptText.accept();
		
	Thread.sleep(3000);
		
		driver.close();
		driver.quit();

	}

}
