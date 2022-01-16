package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example15 
{
		  @Test
	        public void Frame4()
	   	{
	    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://demo.automationtesting.in/Frames.html");
			  driver.manage().window().maximize();
			  
			 /* driver.switchTo().frame("SingleFrame");
			  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
			  driver.switchTo().defaultContent();*/
			  
			  
			  driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
			  WebElement element1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
			  driver.switchTo().frame(element1);
			  
			  WebElement element2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
			  driver.switchTo().frame(element2);
			  
			  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
			  
			  
			  

	}

}
