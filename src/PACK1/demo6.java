package PACK1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium");
		 //Thread.sleep(3000);
	    //List<WebElement> suggestions = driver.findElements(By.xpath("//span[text()='selenium']"));
	    
	    //for( WebElement a:suggestions)
	    //{
	    	//String title = a.getText();
	    	//if(title.equals("selenium interview questions"))
	    	//{
	    		//a.click();
	    		//break;
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(3000);
		 List<WebElement> suggestions = driver.findElements(By.xpath("//span[text()='selenium']"));
		 
		 for(WebElement a:suggestions)
		 {
			String title = a.getText();
			if(title.equals("selenium interview questions"))
			 {
				 a.click();
				 break;
			 }
		 }
	}
	
			 }
			
			 
		
		//login.click();

