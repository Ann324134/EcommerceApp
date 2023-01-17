package newSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhantomJsHeadlessDemo {
	public WebDriver driver;
	
	@Test
	public void headless() {
		System.setProperty("phantomjs.binary.path", "./drivers/phantonjs.exe");
		WebDriverManager.chromedriver().setup();
		driver= new PhantomJSDriver();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//span[.='Next']")).click();
		WebElement errorMessage= driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}

}
