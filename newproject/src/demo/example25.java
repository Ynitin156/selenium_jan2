package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example25 
{

		 @Test
	     public void projectdemo1() throws InterruptedException
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			  driver.manage().window().maximize();
			  driver.findElement(By.id("email_create")).sendKeys("Ynitin156@gmail.com");
			  driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();
			  Thread.sleep(3000);
			  
			  driver.findElement(By.xpath("(//input[@name=\"id_gender\"])[1]")).click();
			  driver.findElement(By.id("customer_firstname")).sendKeys("Nitin");
			  driver.findElement(By.id("customer_lastname")).sendKeys("Yadav");
			  driver.findElement(By.id("email")).clear();
			  driver.findElement(By.id("email")).sendKeys("Ynitin156@gmail.com");
			  driver.findElement(By.id("passwd")).sendKeys("Ynitin00@");
			  driver.findElement(By.id("days")).sendKeys("7");
			  driver.findElement(By.id("months")).sendKeys("March");
			  driver.findElement(By.id("years")).sendKeys("1996");
			  driver.findElement(By.id("optin")).click();
			  
			  driver.findElement(By.id("firstname")).sendKeys("Nitin");
			  driver.findElement(By.id("lastname")).sendKeys("Yadav");
			  driver.findElement(By.id("company")).sendKeys("HCL");
			  driver.findElement(By.id("address1")).sendKeys("old panchwati ghaziabad");
			  driver.findElement(By.id("address2")).sendKeys("panchwati");
			  driver.findElement(By.id("city")).sendKeys("GHAZIABAD");
			  driver.findElement(By.id("id_state")).sendKeys("Washington");
			  driver.findElement(By.id("postcode")).sendKeys("00000");
			  driver.findElement(By.id("id_country")).sendKeys("United States");
			  driver.findElement(By.id("other")).sendKeys("9910183070");
			  driver.findElement(By.id("phone")).sendKeys("9810262894");
			  driver.findElement(By.id("phone_mobile")).sendKeys("9910305181");
			  driver.findElement(By.id("alias")).sendKeys("84panchwati");
			  
			  driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")).click();
		
	     }
 
}
