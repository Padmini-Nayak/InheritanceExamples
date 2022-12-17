import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriversMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		
		System.out.println("The URL of the page is "+driver.getCurrentUrl());
		System.out.println("The Title of the page is "+driver.getTitle());
		
		driver.quit();
		

	}

}
