package newSeleniumConcepts;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {
	public WebDriver driver;
	@Test
	public void fluentWaitDemo() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		WebElement errorMessage= driver.findElement(By.xpath("//div[@class='o6cuMc']"));
	Wait<WebDriver> fluentD = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(2))
				.withTimeout(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		fluentD.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='o6cuMc']")));
				
		String actualError= errorMessage.getAttribute("innerHTML");
		System.out.println(actualError);
		String expectedErrorMessage= "Enter an email or phone number";
	//	Assert.assertEquals(actualError, expectedErrorMessage);
		Assert.assertTrue(actualError.contains("Enter an email"));
		System.out.println("test is succesfull");
	}
}
