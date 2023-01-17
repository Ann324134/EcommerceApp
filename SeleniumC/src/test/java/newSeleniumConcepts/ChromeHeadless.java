package newSeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless {
	public WebDriver driver;
	
	@Test
	public void headlessChrome() {
		/*
		 * ChromeOptions option= new ChromeOptions();
		 *  //write a pre-defined argument
		 * option.addArguments("headless");
		 *  WebDriverManager.chromedriver().setup();
		 * driver= new ChromeDriver(option); */
		EdgeOptions option= new EdgeOptions();
		option.addArguments("headless");
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		/*
		 * driver.findElement(By.xpath("//span[.='Next']")).click(); WebElement
		 * errorMessage= driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		 * System.out.println(driver.getTitle()); String actualError=
		 * errorMessage.getAttribute("innerHTML"); System.out.println(actualError);
		 * String expectedErrorMessage= "Enter an email or phone number"; //
		 * Assert.assertEquals(actualError, expectedErrorMessage);
		 * Assert.assertTrue(actualError.contains("Enter an email"));
		 * System.out.println("test is succesfull");
		 */
	}

}
