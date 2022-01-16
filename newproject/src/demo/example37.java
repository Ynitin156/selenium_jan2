package demo;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class example37 
{

		@Test
	    public void datadriventestingxls() throws BiffException, IOException 
		{
			   WebDriver driver;
			
			   System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			   driver = new ChromeDriver();
			   
			
			Workbook w1= Workbook.getWorkbook(new File("C:\\Users\\HP\\Documents\\data1.xls"));
			Sheet s1=w1.getSheet(0);                /* sheet access */
			for(int i=1;i<s1.getRows();i++)         /*row acess*/
			{
				 driver.get("https://ksrtc.in/oprs-web/login/show.do");
				 String username=s1.getCell(0,i).getContents();                  
				 String password=s1.getCell(1,i).getContents();
				 driver.findElement(By.id("userName")).sendKeys(username);
				 driver.findElement(By.id("password")).sendKeys(password);
				 driver.findElement(By.id("submitBtn")).click();
				 
			}
			 
			
	 	     

	}

}
