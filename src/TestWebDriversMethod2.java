import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriversMethod2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("window.chrome.driver", "C://WebDrivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		System.out.println("The current url is "+driver.getCurrentUrl());
		
		driver.navigate().to("https://www.seleniumhq.org");		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.quit();
		
		}

}
