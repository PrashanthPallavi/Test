package TestNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P2 {
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
@Test
public void fblogin()
{
	
	driver.navigate().to("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("Pallavisshivageni@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Sweetheartjanu@143");
	driver.findElement(By.id("loginbutton")).click();

	}
@AfterMethod
public void postcondition()
{
	driver.close();
	}
@Test
public void acti() throws Throwable
{
	
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
}


}


