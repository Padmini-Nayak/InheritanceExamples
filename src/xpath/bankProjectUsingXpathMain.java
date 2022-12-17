package xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bankProjectUsingXpathMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demo.guru99.com/Agile_Project/Agi_V1/";
		driver.get(URL);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Mini Statement')]")).click();
		
		Select select = new Select(driver.findElement(By.xpath("//tbody/tr[6]/td[2]/select[1]"))); 
		select.selectByVisibleText("3309");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
