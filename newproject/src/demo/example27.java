package demo;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example27 
{
	@Test
	     public void orderedlist() 
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/selectable.html");
			  driver.manage().window().maximize();
			  List<WebElement> ele1=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
			  System.out.println(ele1.size());
			  
			  Actions act1 = new Actions(driver);
			  act1.keyDown(Keys.CONTROL).click(ele1.get(0)).click(ele1.get(2)).click(ele1.get(4)).click(ele1.get(6)).build().perform();
			  

	}

}
