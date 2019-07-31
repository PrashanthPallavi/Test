package TestNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P5 {
	
	@Test
	public void fblogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Pallavisshivageni@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sweetheartjanu@143");
		driver.findElement(By.id("loginbutton")).click();
        driver.close();
		}
	
}


//o/p you will get  