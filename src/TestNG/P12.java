package TestNG;

import static org.junit.Assert.fail;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P12 {
	@Test
	public void acti() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
		
	//WebElement element = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		boolean cond1 = element.isDisplayed();
				
	   Assert.assertTrue(cond1);
		
		
		
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
	    //Thread.sleep(4000);
	    
	   //String expected_title = "actiTIME - Enter Time-Trac";
	   //String actual_title = driver.getTitle();
	    
	   //Assert.assertEquals(actual_title, expected_title);
	   //System.out.println(1234);
	    
	   
	   }
	}


