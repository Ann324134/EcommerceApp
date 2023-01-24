package newSeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {
	public WebDriver driver;
	@Test
	public void charseq() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com");
		WebElement email= driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		//email.sendKeys("Yusuf");
		
		  StringBuffer sb= new StringBuffer() 
		  .append("Yu") 
		  .append("suf") 
		  .append(" ")
		  .append("Aziz");
		   email.sendKeys(sb);
		 
		
		
		
		  
		
	}

}
