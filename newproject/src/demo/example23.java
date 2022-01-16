package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example23 
{
		 @Test
	     public void Dragable()
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/drag.html");
			  driver.manage().window().maximize();
			  WebElement ele1=driver.findElement(By.id("draggable"));
			  Actions act1 = new Actions(driver);
			  act1.dragAndDropBy(ele1, 50, 250).build().perform();
			  

	}

}
