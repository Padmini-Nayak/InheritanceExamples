package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateTextEditBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.firefox.dirver", "C:\\WebDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		String URL = "https://demo.guru99.com/test/newtours/";
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		//Contact Information
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Padmini");
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Nayak");
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("12345");
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("abc@abc.com");
		
		Thread.sleep(2000);
		
		//Mailing information
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("Test Address");
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Test city");
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Test state");
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("464546");
		
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("INDIA");
		
		Thread.sleep(2000);
		//User Information
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Padmini");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("abc");
		
		WebElement confirmPwd = driver.findElement(By.name("confirmPassword"));
		confirmPwd.sendKeys("abc");
		
		Thread.sleep(2000);
		//submit
		
		driver.findElement(By.name("submit")).click();
		
		driver.quit();
	}

}
