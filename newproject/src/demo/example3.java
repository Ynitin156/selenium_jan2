package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 
{

	

		 @Test
		   	public void Testcase3()
		   	{
		    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
				  WebDriver driver = new ChromeDriver();
				  driver.get("http://leafground.com/pages/Link.html");
				  driver.manage().window().maximize();
				  
				  driver.findElement(By.linkText("Go to Home Page")).click();
				  
				  driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
				  
				  driver.findElement(By.linkText("Verify am I broken?")).click();
				  
			      driver.findElement(By.linkText("Go to Home Page")).click(); 
				  
				  driver.findElement(By.linkText("How many links are available in this page?")).click();
				  
				  driver.close();
		   	}
}
