package TestNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P3 {
 public WebDriver driver;
	
	@BeforeClass
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
	}
