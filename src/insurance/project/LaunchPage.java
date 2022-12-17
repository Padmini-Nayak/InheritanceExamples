package insurance.project;

import org.openqa.selenium.WebDriver;

public class LaunchPage {

	private final String URL = "https://demo.guru99.com/insurance/v1/index.php";

	public void launch(WebDriver driver) {

		driver.get(URL);
		driver.manage().window().maximize();
	}

}
