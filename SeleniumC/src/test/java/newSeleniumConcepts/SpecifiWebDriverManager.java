package newSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecifiWebDriverManager {
	public WebDriver driver;
	@Test
public void webdriver() {
		//WebDriverManager.chromedriver().setup(); // 108.0.5359.125
		WebDriverManager.chromedriver().driverVersion("108.0.5359.71").setup();
		driver= new ChromeDriver();
	}
}
