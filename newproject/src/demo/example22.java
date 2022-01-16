package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example22 
{
   @Test
	     public void MousehoverANDKeyboards()
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/");
			  driver.manage().window().maximize();
			  driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a")).click();
			  Actions act1 = new Actions(driver);
			  WebElement ele1=driver.findElement(By.id("email"));
			  
			  act1.sendKeys(ele1, "Nitin@hcl.com").doubleClick().contextClick().build().perform();
			  
		
	}

}
