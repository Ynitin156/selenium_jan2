package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8 
{

		@Test
	   	public void Testalerts() 
	   	{
	    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/Alert.html");
			  driver.manage().window().maximize();
			  driver.findElement(By.xpath("//button[@id='btn']")).click();
			  String msg=driver.switchTo().alert().getText();
			  System.out.println(msg);
			  driver.switchTo().alert().accept();
			  
			 
			  
	   }

}
