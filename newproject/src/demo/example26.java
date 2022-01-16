package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example26 
{

		 @Test
	     public void projectdemo2() throws InterruptedException 
	 	{
	  	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			  driver.manage().window().maximize();
			  driver.findElement(By.id("email")).sendKeys("Ynitin156@gmail.com");
			  driver.findElement(By.id("passwd")).sendKeys("Ynitin00@");
			  driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
			  
			  driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
			  driver.findElement(By.name("submit_search")).click();
			  
			  driver.findElement(By.linkText("Printed Chiffon Dress")).click();
			  
			  driver.findElement(By.id("quantity_wanted")).click();
			  driver.findElement(By.id("group_1")).click();
			  driver.findElement(By.id("color_15")).click();
			  driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
			  WebDriverWait wdw = new WebDriverWait(driver,20);
			  wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]"))).click();
			  
			  WebDriverWait wdw2 = new WebDriverWait(driver,20);
			  wdw2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"))).click();
			  
			  WebDriverWait wdw3 = new WebDriverWait(driver,20);
			  wdw3.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"))).click();
			  
			  driver.findElement(By.id("cgv")).click();
			  
			  WebDriverWait wdw4 = new WebDriverWait(driver,20);
			  wdw4.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"))).click();
			  
		
	}

}
