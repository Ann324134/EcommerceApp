package newSeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyErrorMessage {
	public WebDriver driver;
	@Test
	public void errorMessage() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		WebElement errorMessage= driver.findElement(By.xpath("//div[@class='o6cuMc']"));
	//	System.out.println(errorMessage.getText()); //Enter an email or phone number
		/*
		 * String actualErrorMessage= errorMessage.getText(); String
		 * expectedErrorMessage= "Enter an email or phone number"; // if-else // Assert
		 * class Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		 * System.out.println("Yusuf");
		 */
		String actualError= errorMessage.getAttribute("innerHTML");
		System.out.println(actualError);
		String expectedErrorMessage= "Enter an email or phone number";
	//	Assert.assertEquals(actualError, expectedErrorMessage);
		Assert.assertTrue(actualError.contains("Enter an email"));
		System.out.println("test is succesfull");
		
		
		
		
		
		
		
	}

}
