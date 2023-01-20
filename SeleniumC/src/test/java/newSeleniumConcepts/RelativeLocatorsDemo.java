package newSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorsDemo {
	public WebDriver driver;
	
	@Test
	public void relativeLocators() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement maleRadioButton= driver.findElement(By.xpath("//label[.='Male']"));
	//driver.findElement(RelativeLocator.with(By.name("reg_email__")).above(maleRadioButton)).sendKeys("Annie");
	driver.findElement(RelativeLocator.with(By.xpath("//label[.='Custom']")).toRightOf(maleRadioButton)).click();
	}

}
