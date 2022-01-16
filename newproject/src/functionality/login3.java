package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import objectRepository.elements3;

public class login3 
{
	 @Test
	  public void loginfun() throws IOException, AWTException, InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php?controller=authentication");
		  driver.manage().window().maximize();
		  
		  PageFactory.initElements(driver,elements3.class);
		  
		  elements3.username2.sendKeys("Ynitin1566@gmail.com");
		  elements3.password2.sendKeys("Ynitin000@");
		  
		  WebDriverWait wdw = new WebDriverWait(driver,20);
		  wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")));
		  elements3.click2.click();
		  
		  elements3.search1.sendKeys("T-shirts");
		  elements3.sumbit1.click();
		  
		  elements3.sumbit2.click();
		  elements3.sumbit3.click();
		  elements3.sumbit3.click();
		  elements3.submit4.click();
		  elements3.submit5.click();
		  elements3.submit6.click();
		  
		  WebDriverWait wdw2 = new WebDriverWait(driver,20);
		  wdw2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]"))).click();
		  elements3.submit7.click();
		  
		  WebDriverWait wdw3 = new WebDriverWait(driver,20);
		  wdw3.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"))).click();
		  elements3.submit8.click();
		  
		  WebDriverWait wdw4 = new WebDriverWait(driver,20);
		  wdw4.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[3]/span[1]"))).click();
		  elements3.submit9.click();
		  
		  elements3.submit10.click();
		  
		  WebDriverWait wdw5 = new WebDriverWait(driver,20);
		  wdw5.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"))).click();
		  elements3.submit11.click();
		  
		  
		  
		  
		  
		  
		  Robot robot = new Robot();
		  Dimension screenshot_size=Toolkit.getDefaultToolkit().getScreenSize();
		  Rectangle rect = new Rectangle(screenshot_size); 
		  BufferedImage Source=robot.createScreenCapture(rect);
		  File destination = new File("C:\\Users\\HP\\Downloads\\Screenshot\\screen12.png");
		  ImageIO.write(Source,"png", destination);
	
		  
	  }	  
}
