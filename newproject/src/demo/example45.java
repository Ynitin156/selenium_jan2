package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class example45 
{
	@Test
	    public void uploadfile1() throws AWTException, InterruptedException 
		{
	 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("https://www.ilovepdf.com/excel_to_pdf");
			  driver.findElement(By.id("pickfiles")).click();
			  Thread.sleep(3000);

			  
			  String file_upload = "C:\\Users\\HP\\Downloads\\nitinproject-3.xlsx";
			  StringSelection select1 = new StringSelection(file_upload);
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
			  
			  Robot robot = new Robot();
			  robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_ENTER);
			  robot.keyRelease(KeyEvent.VK_ENTER);
			  
		      
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//button[@id='processTask']")).sendKeys(Keys.ENTER);
			  Thread.sleep(3000);
			  driver.findElement(By.id("pickfiles")).sendKeys(Keys.ENTER);
			 
				  
			  

	}

}
