package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example13
{

		@Test
        public void Frame2() 
   	{
    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://leafground.com/pages/frame.html");
		  driver.manage().window().maximize();
          WebElement element1 =driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/iframe[1]"));
          driver.switchTo().frame(element1);
          
          driver.switchTo().frame("frame2");
          driver.findElement(By.id("Click1")).click();
          driver.switchTo().defaultContent();
          
      
          
          
	}

}
