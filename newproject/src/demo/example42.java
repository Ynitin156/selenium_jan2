package demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example42 
{

	@Test
    public void Cookies3deleC() throws IOException 
	{
 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://ksrtc.in/oprs-web/login/show.do");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          driver.findElement(By.id("userName")).sendKeys("nitin");
          driver.findElement(By.id("password")).sendKeys("nitin@123");
          driver.findElement(By.id("submitBtn")).click();
		
          
          File f1 = new File("C:\\Users\\HP\\Downloads\\Screenshot\\cookies.data");
          try
          {
          f1.createNewFile();
          FileWriter fw = new FileWriter(f1);
          BufferedWriter bw = new BufferedWriter(fw);
          
          Cookie c1 = new Cookie("mycookie1","123456");
          driver.manage().addCookie(c1);
          Cookie c2 = new Cookie("mycookie2","1234567");
          driver.manage().addCookie(c2);
           
          driver.manage().deleteCookie(c1);                           /*object*/
          driver.manage().deleteCookieNamed("mycookie2");             /*name*/
          
          
          for(Cookie ck:driver.manage().getCookies())
          {
        	 bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getValue()+";"+ck.isSecure()+";"+ck.getExpiry()));
        	 bw.newLine();
        	 
          }
          bw.close();
          fw.close();
          }
          catch(Exception e)
          {
        	  System.out.println(e);
          }

	}

}
