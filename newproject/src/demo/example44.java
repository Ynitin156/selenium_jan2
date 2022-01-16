package demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example44
{
 @Test
		    public void downloadfile() throws IOException 
			{
		 	      System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
				  WebDriver driver = new ChromeDriver();
				  driver.get("http://leafground.com/pages/download.html");
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				  driver.findElement(By.linkText("Download Excel")).click();
				  File filelocation = new File("C:\\Users\\HP\\Downloads");
				  File[] total_files= filelocation.listFiles();
				  for(File file:total_files)
				  {
					 if( file.getName().equalsIgnoreCase("testleaf.xlsx"));
					 {
						 System.out.println("file download succesfully");
					 }
					 break;
					 
				  }
				  

	}

}
