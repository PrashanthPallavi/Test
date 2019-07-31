package TestNG;

import static org.junit.Assert.fail;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P13 {
	@Test
	public void acti() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000);
	
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(4000);
	    
	   String expected_title = "actiTIME - Enter Time-Track";
	   String actual_title = driver.getTitle();
	    
	 SoftAssert Sa = new SoftAssert();
	 Sa.assertEquals(actual_title, expected_title);
	   
	   System.out.println(1234);
	   Sa.assertAll();
	   
	}
}
