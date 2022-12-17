import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElementsTextBoxMain {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/text-box";
		
		driver.get(URL);
		
		driver.findElement(By.id("userName")).sendKeys("Padmini Nayak");
		driver.findElement(By.id("userEmail")).sendKeys("abc@abc.com");
		driver.findElement(By.id("currentAddress")).sendKeys("UDUPI , Karnataka");
		driver.findElement(By.id("permanentAddress")).sendKeys("Vijaya Bank Colony ,Bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
