package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaPractise 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("Nitin");
        driver.findElement(By.name("lastname")).sendKeys("Yadav");
        driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
        driver.findElement(By.xpath("//tbody/tr[4]/td[2]/span[5]/input[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("10july2021");
        driver.findElement(By.xpath("//tbody/tr[6]/td[2]/span[1]/input[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("C:\\Users\\HP\\Downloads\\istockphoto-162235359-1024x1024.jpg");
        driver.findElement(By.xpath("(//input[@name=\"tool\"])[2]")).sendKeys(Keys.ENTER);
        
	}
	
}
