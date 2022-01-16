package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example10
{


		@Test
        public void Testalerts() 
   	{
    	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/Alerts.html");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		  driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		  String msg2=driver.switchTo().alert().getText();
		  System.out.println(msg2);
		  driver.switchTo().alert().accept();

	}

}
