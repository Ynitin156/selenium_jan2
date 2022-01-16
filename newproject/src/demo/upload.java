package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\HP\\Downloads\\istockphoto-162235359-1024x1024.jpg");
        
        
	}

}
