package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6 {

		@Test
	   	public void Testcase6()
	   	{
	    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/checkbox.html");
			  driver.manage().window().maximize();
			  
			  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[1]/div[1]/input[1]")).click();
			  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[1]/div[3]/input[1]")).click();
              
			  
			  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/div[1]/input[1]")).click();
			  
			  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[3]/div[2]/input[1]")).click();
			  
			  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[4]/div[1]/input[1]")).click();
			  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[4]/div[4]/input[1]")).click();
	}

}
