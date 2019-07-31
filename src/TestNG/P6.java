package TestNG;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class P6 extends basetest {
	
	@Test
	public void fblogin()
	{

		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Pallavisshivageni@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sweetheartjanu@143");
		driver.findElement(By.id("loginbutton")).click();
	}

}
