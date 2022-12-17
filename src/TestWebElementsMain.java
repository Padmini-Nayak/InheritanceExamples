import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElementsMain {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/automation-practice-form";
		
		driver.get(URL);
		
		WebElement firstNameElement = driver.findElement(By.id("firstName"));
		WebElement lastNameElement = driver.findElement(By.id("lastName"));
		WebElement userEmailElement = driver.findElement(By.id("userEmail"));
		
		
		firstNameElement.sendKeys("Padmini");
		lastNameElement.sendKeys("Nayak");
		userEmailElement.sendKeys("shirva.nayak@gmail.com");
		
		WebElement tagNameExample = driver.findElement(By.tagName("input"));
		
		tagNameExample.sendKeys("PadminiUsingTagName");
		
		//Close the current URL window
		//driver.quit();
	}

}
