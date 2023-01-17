package newSeleniumConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadProperties {
	
	public WebDriver driver;
	@Test
	public void readProperties() throws IOException, InterruptedException {
		//set the path of properties file before opening the browser
		//create object of properties class
		Properties prop= new Properties();
		// it is present inside java.util package and takes a default constructor
		FileInputStream fis= new FileInputStream("./config.properties");
		// in order to load the properties file inside the class , i have a method
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
driver.findElement(By.xpath(prop.getProperty("usernameTextFieldLocator"))).sendKeys(prop.getProperty("username"));
Thread.sleep(2000);
driver.findElement(By.xpath(prop.getProperty("passwordTextFieldLocator"))).sendKeys(prop.getProperty("password"));
Thread.sleep(2000);
driver.findElement(By.xpath(prop.getProperty("loginButtonLocator"))).click();
		
		
	}

}
