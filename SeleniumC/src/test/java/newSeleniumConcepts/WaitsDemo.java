package newSeleniumConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {
	
	public WebDriver driver;
	@Test
	public void waits() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//in sel v3
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//in sel V4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3)); //TimeoutException:
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1));
		driver.get("https://www.samsung.com");
		//WebElement loginButton= driver.findElement(By.xpath("//button[@name='login']"));
	}

}
