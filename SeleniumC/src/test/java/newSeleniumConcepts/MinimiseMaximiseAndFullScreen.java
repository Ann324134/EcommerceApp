package newSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimiseMaximiseAndFullScreen {
	public WebDriver driver;
	@Test
	public void minmaxfull() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://www.netflix.com");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.manage().window().minimize();
		 Thread.sleep(3000);
		 driver.manage().window().fullscreen();
	}

}
