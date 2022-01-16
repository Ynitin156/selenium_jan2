package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example14 
{
      @Test
        public void Frame3()
   	{
    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/Frames.html");
		  driver.manage().window().maximize();
		  WebElement element1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		  driver.switchTo().frame(element1);
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		  
		  

	}

}
