package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class example38 
{

	@Test
    public void datadriventestingApache() throws IOException 
	{
		   WebDriver driver;
		
		   System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		   driver = new ChromeDriver();
		   
		   FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\daat2.xlsx");
		   XSSFWorkbook w1 = new XSSFWorkbook(fis);
		   XSSFSheet s1=w1.getSheetAt(0);
		   for(int i=1;i<s1.getLastRowNum();i++)
		   {
			   driver.get("https://ksrtc.in/oprs-web/login/show.do");
			   XSSFRow Current_Row=s1.getRow(i);
			   String username=Current_Row.getCell(0).getStringCellValue();
			   String password=Current_Row.getCell(1).getStringCellValue();
			   driver.findElement(By.id("userName")).sendKeys(username);
			   driver.findElement(By.id("password")).sendKeys(password);
			   driver.findElement(By.id("submitBtn")).click();
		   }

	}

}
