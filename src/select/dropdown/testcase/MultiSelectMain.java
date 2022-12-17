
// https://demo.guru99.com/test/newtours/


package select.dropdown.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectMain {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/select-menu";
		driver.get(URL);

		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.id("cars")));
		
		List<WebElement> list = select.getOptions();
		
		for (WebElement webElement : list) {
			System.out.println("The options are "+webElement.getText());
		}
		
		System.out.println("If the dropdown is Multiple "+select.isMultiple());
		
		if(select.isMultiple()) {
			select.selectByIndex(1);
			select.selectByVisibleText("Opel");
			
			List<WebElement> selectedList = select.getAllSelectedOptions();
			
			System.out.println("The selected options are");
			for (WebElement webElement : selectedList) {
				System.out.println(webElement.getText()+" ");
			}
			
			select.deselectByIndex(1);
			
			selectedList = select.getAllSelectedOptions();
			System.out.println("The selected options are");
			for (WebElement webElement : selectedList) {
				System.out.println(webElement.getText()+" ");
			}
		}
	}

}
