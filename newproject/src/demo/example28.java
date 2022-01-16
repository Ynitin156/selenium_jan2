package demo;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example28 
{
	@Test
	     public void autoselect() throws InterruptedException 
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/autoComplete.html");
			  driver.manage().window().maximize();
			  driver.findElement(By.id("tags")).sendKeys("S");
			  Thread.sleep(3000);
			  List<WebElement> element1=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
			  
			  for(WebElement el:element1)
			  {
				  if(el.getText().equalsIgnoreCase("SOAP"))
				  {
					  el.click();
					  break;
				  }
				  
			  }
			  

	}

}
