package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class example36 
{
	@Test
    public void fluenttWait() 
	{
 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://leafground.com/pages/Edit.html");
		  driver.manage().window().maximize();
		  /*driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/
		  
		  FluentWait fw = new FluentWait(driver);
		  
		  fw.withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		  
		  fw.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));     
		  
		 /* fw.until(ExpectedConditions.elementToBeClickable(By.id("email")));              
		  fw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("email")));   */
		  
          driver.findElement(By.id("email")).sendKeys("HCL1");

	}

}
