package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example19
{

		 @Test
	     public void basiccommandsGetText()
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/table.html");
			  driver.manage().window().maximize();
			  String tablevalue = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[6]")).getText();
			  System.out.println(tablevalue);

	}

}
