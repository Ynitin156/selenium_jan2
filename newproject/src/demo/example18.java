package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example18 
{
	  @Test
	     public void basiccommands()
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/Edit.html");
			  driver.manage().window().maximize();			  
			  driver.findElement(By.id("email")).sendKeys("hello");
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl());
			  System.out.println(driver.getPageSource());
			  
	}

}
