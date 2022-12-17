import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButtonElementsMain {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			String URL = "https://demo.guru99.com/test/radio.html";

			driver.get(URL);
			
			Thread.sleep(2000);
			
			WebElement option1Element = driver.findElement(By.id("vfb-7-1"));
			
			System.out.println("The option1Element is selected "+option1Element.isSelected());
			option1Element.click();
			System.out.println("The option1Element is selected "+option1Element.isSelected());
			
			Thread.sleep(2000);
			
			WebElement option2Element = driver.findElement(By.id("vfb-7-2"));
			System.out.println("The option1E2ement is selected "+option2Element.isSelected());
			option2Element.click();
			System.out.println("The option2Element is selected "+option2Element.isSelected());
			
			Thread.sleep(2000);
			
			WebElement option3Element = driver.findElement(By.id("vfb-7-3"));
			System.out.println("The option1E3ement is selected "+option3Element.isSelected());
			option3Element.click();
			System.out.println("The option3Element is selected "+option3Element.isSelected());
			
			System.out.println("The option 3 is enabled"+option3Element.isEnabled());
			
			Thread.sleep(2000);
			
			driver.close();
	}

}
