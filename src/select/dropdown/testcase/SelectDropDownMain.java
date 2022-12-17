package select.dropdown.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownMain {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/select-menu";
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		List<WebElement> list = select.getOptions();
		
		for (WebElement webElement : list) {
			System.out.println("The list of colors are "+webElement.getText());
		}
		
		select.selectByIndex(4);
		System.out.println("The selected value is "+select.getFirstSelectedOption().getText());
		
          select.selectByValue("6");
		
		System.out.println("Selected Value is:"+ select.getFirstSelectedOption().getText());
		
		select.selectByVisibleText("Blue");
		
		System.out.println("Selected Value is:"+ select.getFirstSelectedOption().getText());

		driver.quit();
	}

}
