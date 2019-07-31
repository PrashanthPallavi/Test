package PACK1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo13 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		//WebElement element = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
		//boolean cond1 = element.isDisplayed();
		//System.out.println(cond1);
		System.out.println(element.isSelected());
		element.click();
		System.out.println(element.isSelected());
	}
}

		
		

			