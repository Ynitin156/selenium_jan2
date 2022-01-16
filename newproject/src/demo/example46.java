package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example46 
{
			@Test
			    public void uploadfile2() throws AWTException, InterruptedException 
				{
			 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
					  WebDriver driver = new ChromeDriver();
					  driver.get("https://www.ilovepdf.com/pdf_to_word");
					  driver.findElement(By.id("pickfiles")).click();
					  Thread.sleep(3000);

					  
					  String file_upload = "C:\\Users\\HP\\Downloads\\BijendraKumarSingh_sfdc.pdf";
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
