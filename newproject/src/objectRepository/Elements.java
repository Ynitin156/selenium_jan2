package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements 
{
	
	@FindBy(id="userName")    /*pagefactory*/
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	public static WebElement login;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* public static WebElement username(WebDriver driver)
	  {
		  return driver.findElement(By.id("userName"));
	  }
	  
	  public static WebElement password(WebDriver driver)
	  {
		  return driver.findElement(By.name("password"));
	  }
	  
	  public static  WebElement login(WebDriver driver)
	  {
		  return driver.findElement(By.xpath("//input[@value='Login']"));
	  }*/
}
