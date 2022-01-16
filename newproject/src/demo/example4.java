package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4 
{

	
		@Test
	   	public void Testcase4()
	   	{
	    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/Image.html");
			  driver.manage().window().maximize();
			  
			/*  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[1]/div[1]/div[1]/img[1]")).click();*/
		        
			    driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[3]/div[1]/div[1]/img[1]")).click();
		       
			    driver.close();

	}

}
