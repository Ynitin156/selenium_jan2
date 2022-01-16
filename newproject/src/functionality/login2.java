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
import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import objectRepository.elements2;

public class login2
{
	 @Test
	  public void loginfun() throws IOException, AWTException, InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		  driver.manage().window().maximize();
		  
		  PageFactory.initElements(driver,elements2.class);
		  
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  elements2.username.sendKeys("Ynitin1556@gmail.com");
		  elements2.login.click();
		  
		  WebDriverWait wdw = new WebDriverWait(driver,20);
		  wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='id_gender'])[1]")));
		  elements2.click1.click();
		  
		  elements2.customer1.sendKeys("Nitin");
		  elements2.customer2.sendKeys("Yadav");
		  elements2.clear1.clear();
		  elements2.email1.sendKeys("Ynitin1566@gmail.com");
		  elements2.email2.sendKeys("Ynitin000@");
		  elements2.days1.sendKeys("10");
		  elements2.month1.sendKeys("july");
		  elements2.years1.sendKeys("1997");
		  elements2.click2.click();
		  elements2.firstname1.sendKeys("Nitin");
		  elements2.lastname2.sendKeys("Yadav");
		  elements2.company.sendKeys("HCL");
		  elements2.address3.sendKeys("old panchwati ghaziabad");
		  elements2.address4.sendKeys("panchwati");
		  elements2.city.sendKeys("ghaziabad");
		  elements2.state.sendKeys("Florida");
		  elements2.postcode.sendKeys("00000");
		  elements2.country1.sendKeys("United States");
		  elements2.other.sendKeys("9810262894");
		  elements2.phone1.sendKeys("9910305181");
		  elements2.phone2.sendKeys("9910183070");
		  elements2.alias.clear();
		  elements2.alias.sendKeys("hello");
		  elements2.click3.click();
		  
		  
		  
		  
		  
		  
		  
		  Robot robot = new Robot();
		  Dimension screenshot_size=Toolkit.getDefaultToolkit().getScreenSize();
		  Rectangle rect = new Rectangle(screenshot_size); 
		  BufferedImage Source=robot.createScreenCapture(rect);
		  File destination = new File("C:\\Users\\HP\\Downloads\\Screenshot\\screen10.jpg");
		  ImageIO.write(Source,"png", destination);
		  
		
		  
		  
		  
		  
		 
		  
		 
		  
		  
	  }  
}
