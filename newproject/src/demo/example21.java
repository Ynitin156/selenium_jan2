package demo;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example21 {


		@Test
	     public void basiccommandsMaxandMin()
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/table.html");
			  Dimension dem = new Dimension(50,25);
			  driver.manage().window().setSize(dem);
			  driver.manage().window().maximize();
			  
			  

	}

}
