package demo;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example31 
{

	@Test
    public void autoselect2() throws InterruptedException 
	{
 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/AutoComplete.html");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("searchbox")).sendKeys("A");
		  Thread.sleep(10000);
		  List<WebElement> element2=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		  
		  for(WebElement el1:element2)
		  {
			  if(el1.getText().equalsIgnoreCase("India"))
			  {
				  el1.click();
				  break;
			  }
			  
		  }
		  

}
}
