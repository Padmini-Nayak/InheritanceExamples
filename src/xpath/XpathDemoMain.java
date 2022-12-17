package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemoMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/text-box";
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
		fullName.sendKeys("Padmini Nayak");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("abc@abc.com");
		
		WebElement currentAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentAdd.sendKeys("Test Address");
		
		WebElement permanentAdd = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanentAdd.sendKeys("Permanent address");
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(2000);
		
driver.quit();

	}

}
