package demo;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example16 
{

		  @Test
	        public void Window()
	   	{
	    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://leafground.com/pages/Window.html");
			  String w1=driver.getTitle();
			  driver.manage().window().maximize();
			  driver.findElement(By.id("home")).click();
			  Set<String> windows=driver.getWindowHandles();
			  Iterator<String> iter=windows.iterator();
			  String Window1=iter.next();
			  String Window2=iter.next();
			  driver.switchTo().window(Window2);
			  String w2=driver.getTitle();
			  System.out.println(w1);
			  System.out.println(w2);
			  System.out.println(Window1);
			  System.out.println(Window2);
			  driver.findElement(By.xpath("//h5[contains(text(),'Edit')]")).click();
	}

}
