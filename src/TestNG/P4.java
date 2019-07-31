package TestNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class P4 {
	@BeforeClass
	public void precondition()
	{
		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}
	@Test
	public void acti()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	    driver.close();
	}

}
