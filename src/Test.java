import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("windows.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		
		String url = "https://google.com";
		driver.get(url);
		
		System.out.println("The title of the page is "+driver.getTitle());
		System.out.println("The title of the page is "+driver.getCurrentUrl());
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		driver.navigate().to("https://www.gmail.com");
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		driver.navigate().to("https://www.nykaa.com");
		
		String pageSource = driver.getPageSource();
		
		System.out.println("The source of the "+driver.getCurrentUrl());
		System.out.println(pageSource);
		driver.navigate().back();
		
		driver.close();
		//driver.quit();
	}

}
