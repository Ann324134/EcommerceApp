package newSeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecialLocators {
	
	public WebDriver driver;
	@Test
	public void specialLocators() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
//WebElement emailTextField= driver.findElement(new ByAll(By.id("ema"),By.name("email"),By.xpath("//input[@placeholder='Email address or phone number']")));
//emailTextField.sendKeys("Annie");
// new ByAll() works on or operator

WebElement emailTextField= driver.findElement(new ByIdOrName("email"));
emailTextField.sendKeys("Annie");

		
	}

}
