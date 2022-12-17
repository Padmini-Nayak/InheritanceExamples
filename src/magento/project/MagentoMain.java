package magento.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://magento.softwaretestingboard.com/";
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(2000);
		
		WebElement women = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
		women.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Tops')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Breathe-Easy Tank')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("product-addtocart-button")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
