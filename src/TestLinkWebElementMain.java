import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLinkWebElementMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/links";

		driver.get(URL);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));

		for (Iterator iterator = linkElements.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();

			/* Stale element exception was found. Tried to refresh and navigate back to the page but couldnt . */
			
			//webElement.click();
			//Thread.sleep(5000);
			// driver.quit();
			//driver.navigate().to(URL);
			//driver.navigate().refresh();
			System.out.println(webElement.getText());
		}

		driver.quit();
	}

}
