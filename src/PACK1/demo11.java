package PACK1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo11 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.actitime.com/?utm_expid=.NGjrl8ESRiKLFAIxN58aDQ.0&utm_referrer=");
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		//WebElement element = driver.findElement(By.xpath("(//a[text()='Start Using actiTIME'])[2]"));
		//int x = element.getLocation().getX();
		//System.out.println(x);
		//int y = element.getLocation().getY();
		//System.out.println(y);
		
		//JavascriptExecutor j = (JavascriptExecutor)driver;//typ
		//j.executeScript("window.scrollBy(0,6000);");
		//j.executeScript("window.scrollBy("+x+","+y+")"); 
	WebElement element = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
	String tn = element.getTagName();
	if(tn.equals("a"))
System.out.println("pass: it is a link");
	else
		System.out.println("Fail:it is not a link");
	}
	
	}

	

		