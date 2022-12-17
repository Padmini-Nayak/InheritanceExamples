package insurance.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	
	
	WebDriver driver = new ChromeDriver();

	//String URL = "https://demo.guru99.com/insurance/v1/index.php";
	
	public void test(boolean login , String url) throws InterruptedException {
		if(login) {
			logIn(url);
		}else {
			register(url);
		}
	}
	
	public  void logIn(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc@abc.com");
		driver.findElement(By.id("password")).sendKeys("3423");
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);

		driver.close();
		
	}
	
	public void register(String url) throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
//Ways to find Register element by different locators		
		//driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.partialLinkText("Reg")).click();

		/*
		 * List<WebElement> aLinks = driver.findElements(By.tagName("a")); String text;
		 * 
		 * for (WebElement webElement : aLinks) { text = webElement.getText(); if
		 * (text.equals("Register")) { System.out.println("resgister button clicked");
		 * webElement.click(); break; } }
		 */

		Thread.sleep(2000);

		driver.findElement(By.id("user_firstname")).sendKeys("Padmini");
		driver.findElement(By.id("user_surname")).sendKeys("Nayak");
		driver.findElement(By.id("user_phone")).sendKeys("123456");

		driver.findElement(By.id("licencetype_f")).click();

		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Address");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("city");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("country");

		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("6745");
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("6745");

		driver.findElement(By.name("submit")).click();

		Thread.sleep(5000);

		driver.close();
		
	}

}
