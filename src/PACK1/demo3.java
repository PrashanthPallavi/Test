package PACK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		//driver.get("https://www.gmail.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.navigate().to("file:///C:/Users/pallavi/Desktop/test1.html");
	//WebElement link = driver.findElement(By.id("t1"));
		//WebElement link = driver.findElement(By.name("d1"));
	     //WebElement link = driver.findElement(By.className("c1"));
		//WebElement link = driver.findElement(By.tagName("a"));
	//WebElement link = driver.findElement(By.linkText("Google"));
		//WebElement link = driver.findElement(By.partialLinkText("gle"));
		
		
		driver.navigate().to("https://www.facebook.com");
		WebElement textbox = driver.findElement(By.tagName("inputtext"));
	WebElement pass = driver.findElement(By.tagName("inputtext"));
	textbox.sendKeys("Pallavisshivageni@gmail.com");
		pass.sendKeys("Sweetheartjanu@143");
		WebElement login = driver.findElement(By.tagName("loginbutton"));
		login.click();

		
		//WebElement link = driver.findElement(By.className("c1"));
		//WebElement link = driver.findElement(By.tagName("text"));
		
		//link.click();
		//driver.close();// --> it will search to google web page
	}

}
