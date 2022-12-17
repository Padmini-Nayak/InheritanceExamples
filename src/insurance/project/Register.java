package insurance.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {

	public void register(WebDriver driver) throws InterruptedException {

		driver.findElement(By.partialLinkText("Reg")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("user_firstname")).sendKeys("Padmini");
		driver.findElement(By.id("user_surname")).sendKeys("Nayak");
		driver.findElement(By.id("user_phone")).sendKeys("123456");

		driver.findElement(By.id("licencetype_f")).click();

		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Address");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("city");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("country");
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("abc@abv.bg");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("pwd");
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("pwd");

		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);

	}

}
