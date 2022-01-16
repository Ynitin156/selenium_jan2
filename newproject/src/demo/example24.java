package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example24 
{

		 @Test
	     public void Dropable()
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/drop.html");
			  driver.manage().window().maximize();
			  Actions act1 = new Actions(driver);
			  WebElement ele1=driver.findElement(By.id("draggable"));
		      WebElement ele2=driver.findElement(By.id("droppable"));
              act1.dragAndDrop(ele1, ele2).build().perform();
			  

	}

}
