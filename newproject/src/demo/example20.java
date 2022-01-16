package demo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example20 
{
 @Test
	     public void basiccommandsnavigate()
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/table.html");
			  driver.manage().window().maximize();
			  driver.navigate().back();
			  driver.navigate().forward();
			  driver.navigate().refresh();
			  driver.navigate().to("https://www.facebook.com");

	}

}
