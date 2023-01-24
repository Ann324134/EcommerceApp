package newSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRect { 
	public WebDriver driver;
	@Test
	public void getRect() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement loginButton= driver.findElement(By.xpath("//button[@name='login']"));
		//in sel v4
		Rectangle r= loginButton.getRect();
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getX());
		System.out.println(r.getY());
		// in sel V3
		//SIZE- height and width
		//Location-  x and y axis
		/*
		 * Dimension d= loginButton.getSize(); System.out.println(d.getHeight());
		 * System.out.println(d.getWidth());
		 * 
		 * Point p =loginButton.getLocation(); System.out.println(p.getX());
		 * System.out.println(p.getY());
		 */
		//48
	//	364
	//	597
	//	280
		/*
		 48
          364
          597
            280
		 */
		
		
		
	}

}
