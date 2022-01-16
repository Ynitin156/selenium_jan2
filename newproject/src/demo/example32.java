package demo;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example32 
{

		@Test
	    public void javaexecutor() throws InterruptedException 
		{
	 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://demo.automationtesting.in/Datepicker.html");
			  driver.manage().window().maximize();
			  
			  JavascriptExecutor jse = (JavascriptExecutor) driver;
			  
			  jse.executeScript("document.getElementById('datepicker1').value='8/6/1996'");
			  
			  jse.executeScript("document.getElementById('datepicker2').value='10/7/1998'");
	}

}
