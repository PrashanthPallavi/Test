package PACK1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo15 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		int h1=username.getSize().getHeight();
		int w1=username.getSize().getWidth();
		
		int h2=password.getSize().getHeight();
		int w2=password.getSize().getWidth();
		
		if(h1==h2&&w1==w2)
			System.out.println("Pass:same dimension");
			else
				System.out.println("Fail:different dimension");
		}
	
		}


