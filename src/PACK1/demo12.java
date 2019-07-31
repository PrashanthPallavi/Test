package PACK1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo12 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(4000);
		WebElement textbox = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	textbox.sendKeys("Pallavisshivageni@gmail.com");
	pass.sendKeys("Sweetheartjanu@143");
	WebElement login = driver.findElement(By.id("loginbutton"));
		//login.sendKeys(Keys.ENTER);//submit
       //textbox.clear();
      String tn = login.getTagName();
      System.out.println(tn);
	}
}
