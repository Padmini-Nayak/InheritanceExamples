package insurance.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	public void logIn(WebDriver driver) throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys("abc@abv.bg");
		driver.findElement(By.id("password")).sendKeys("pwd");
		driver.findElement(By.name("submit")).click();
	}

}
