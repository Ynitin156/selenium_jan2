package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectRepository.Elements;

public class loginpage 
{
  @Test
  public void loginfun() throws IOException, AWTException
  {
	  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://ksrtc.in/oprs-web/login/show.do");
	  driver.manage().window().maximize();
	  
	  
	  PageFactory.initElements(driver, Elements.class);
	 
	 
	  Elements.username.sendKeys("nitin");
	  Elements.password.sendKeys("nitinhcl@");
	  Elements.login.click();
	  
	  Robot robot = new Robot();
	  Dimension screenshot_size=Toolkit.getDefaultToolkit().getScreenSize();
	  Rectangle rect = new Rectangle(screenshot_size); 
	  BufferedImage Source=robot.createScreenCapture(rect);
	  File destination = new File("C:\\Users\\HP\\Downloads\\Screenshot\\screen3.png");
	  ImageIO.write(Source,"png", destination);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*try
	  {
	  TakesScreenshot tk1 = (TakesScreenshot) driver;        
	  File Source=tk1.getScreenshotAs(OutputType.FILE);
	  File destination= new File("C:\\Users\\HP\\Downloads\\Screenshot\\screen1.jpg");
	  FileHandler.copy(Source, destination);
	  }
	  catch(Exception e)
	  {
		  System.out.println("screenshot generated");
	  }*/
	  
	  
	  
  }
}
