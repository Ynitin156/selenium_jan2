package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2
{

	 @Test
	   	public void Testcase2()
	   	{
	    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/Button.html");
			  driver.manage().window().maximize();
			  
			  driver.findElement(By.id("home")).click();
			  
			  driver.findElement(By.id("position")).click();
			  
			  driver.findElement(By.id("color")).click();
			  
			  driver.findElement(By.id("size")).click();
			  
			  driver.close();
			  
	   	}

}
