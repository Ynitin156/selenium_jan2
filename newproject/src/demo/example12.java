package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example12 
{

	@Test
        public void Frame1() 
   	{
    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://leafground.com/pages/frame.html");
		  driver.manage().window().maximize();
          driver.switchTo().frame(0);
          driver.findElement(By.id("Click")).click();
          driver.switchTo().defaultContent();
		  
	}

}
