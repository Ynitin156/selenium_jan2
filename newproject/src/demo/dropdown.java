package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        //Select obj = new Select(driver.findElement(By.id("Skills")));
        //obj.selectByIndex(9);
        //obj.selectByValue("Unix");
        
        Select obj = new Select(driver.findElement(By.id("yearbox")));
        obj.selectByIndex(30);
        Thread.sleep(1000);
        
        Select obj2 = new Select(driver.findElement(By.xpath("//*[@placeholder=\"Month\"]")));
        obj2.selectByIndex(6);
        Thread.sleep(1000);
        
        Select obj3 = new Select(driver.findElement(By.id("daybox")));
        obj3.selectByIndex(15);
        Thread.sleep(1000);
        
       

	}

}
