package newSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTab {
	public WebDriver driver;
	@Test
	public void windowtab() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 Thread.sleep(3000);
		// driver.switchTo().newWindow(WindowType.TAB);
	}

}
