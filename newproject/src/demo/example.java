package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class example 
{
    @Test
	public void Testcase1() throws IOException
	{
    	WebDriver driver;
    	
    	FileInputStream st = new FileInputStream("src\\demo\\Config.properties");
    	Properties pro = new Properties();
    	pro.load(st);
    	String broswer_name=pro.getProperty("broswer");
    	String driver_path=pro.getProperty("path");
    	
    	if(broswer_name.equalsIgnoreCase("chrome"))
    	{
    		
		  System.setProperty("webdriver.chrome.driver",driver_path);
		  driver = new ChromeDriver();
		  
		  
    	}
    	else if(broswer_name.equalsIgnoreCase("firefox"))
    	{
    	  System.setProperty("webdriver.gecko.driver",driver_path);
  		  driver = new FirefoxDriver();
    	}
    	
    	
    	else
    	{
    		System.setProperty("webdriver.ie.driver",driver_path);
		    driver = new InternetExplorerDriver();
    	}
    	
    	
    	
		  driver.get("http://leafground.com/pages/Edit.html");
		  
		  driver.manage().window().maximize();
		  
		  
		  driver.findElement(By.id("email")).sendKeys("HCL1");
		  
		  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/div[1]/div[1]/input[1]")).clear();
		  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("HCL2");
		  
		  driver.findElement(By.name("username")).clear();
		  driver.findElement(By.name("username")).sendKeys("HCL3");
		  
		  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[4]/div[1]/div[1]/input[1]")).clear();
		  driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("HCL4");
		  
		
	    
    
    
	}  
}
