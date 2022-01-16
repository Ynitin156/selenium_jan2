package demo;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example35
{
	@Test
    public void explicitWait() 
	{
 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://leafground.com/pages/Edit.html");
		  driver.manage().window().maximize();
		 /* driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/
		  
		  WebDriverWait wbw = new WebDriverWait(driver,20);
		  wbw.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));        /*textbox*/
		  wbw.until(ExpectedConditions.elementToBeClickable(By.id("email")));              /*radiobutton,checkbox,button,link*/
		  wbw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("email")));   /*frames*/
		  
          driver.findElement(By.id("email")).sendKeys("HCL1");
		  
		 
	}

}
