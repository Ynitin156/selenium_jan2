package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example7 
{
	 @Test
	   	public void Testcasedropdown() 
	   	{
	    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/Dropdown.html");
			  driver.manage().window().maximize();
			  Select obj = new Select(driver.findElement(By.id("dropdown1")));
			  obj.selectByVisibleText("Appium");
			  
			  Select obj2 = new Select(driver.findElement(By.name("dropdown2")));
			  obj2.selectByValue("2");
			  
			  Select obj3 = new Select(driver.findElement(By.id("dropdown3")));
			  obj3.selectByIndex(3);
			  
			  Select obj4 = new Select(driver.findElement(By.className("dropdown")));
			  obj4.selectByIndex(2);
			  
			  Select obj5 = new Select(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/section[1]/div[5]/select[1]")));
			  obj5.selectByIndex(1);
			  
			  Select obj6 = new Select(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[6]/select[1]/option[2]")));
			  obj6.selectByIndex(1);
			  obj6.selectByIndex(2);
			  obj6.selectByIndex(3);
			
			  
			  
			  
		
   }

}
