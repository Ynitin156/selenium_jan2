package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11
{

		@Test
        public void Testalerts() 
   	{
    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/Alerts.html");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		  driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		  driver.switchTo().alert().sendKeys("hello");
		  driver.switchTo().alert().accept();

	}

}
