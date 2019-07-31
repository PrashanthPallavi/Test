package PACK1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo19 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='pwd']"));
		textbox.sendKeys("admin");
		pass.sendKeys("mamager");
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		login.click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='logoutlink']")).click();
	}
}

