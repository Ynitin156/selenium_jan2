package demo;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example17 
{

	  @Test
      public void Window2()
 	{
  	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/Windows.html");
		  String w1=driver.getTitle();
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
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
		  
		  
		  
		  
	}

}
