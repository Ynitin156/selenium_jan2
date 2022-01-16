package demo;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example34 
{
	@Test
    public void implicitWait() 
	{
 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://leafground.com/pages/Edit.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  
          driver.findElement(By.id("email")).sendKeys("HCL1");
		  
		  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/div[1]/div[1]/input[1]")).clear();
		  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("HCL2");
		  
		  driver.findElement(By.name("username")).clear();
		  driver.findElement(By.name("username")).sendKeys("HCL3");
		  
		  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[4]/div[1]/div[1]/input[1]")).clear();
		  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("HCL4");
		  
		  

	}

}
