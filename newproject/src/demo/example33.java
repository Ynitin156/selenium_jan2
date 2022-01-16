package demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example33 
{
	@Test
	    public void scrollPage() throws InterruptedException 
		{
	 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
			  driver.manage().window().maximize();
			  JavascriptExecutor jse = (JavascriptExecutor) driver;
			  jse.executeScript("scroll(0,900)");
			  
			  WebElement ele1=driver.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[9]/textarea"));
			  jse.executeScript("arguments[0].scrollIntoView(true)",ele1);
			  ele1.clear();
			  ele1.sendKeys("nitinyadav");
			  
			  
			  WebElement ele2=driver.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[2]/input"));
			  jse.executeScript("arguments[0].scrollIntoView(true)",ele2);
			  ele2.clear();
			  ele2.sendKeys("hello");
			  
			  

	}
	
	
	
    

	
	

}
