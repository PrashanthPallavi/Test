package PACK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	
		static
		{
			System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		}
		public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			//driver.navigate().to("file:///C:/Users/pallavi/Desktop/test4.html");
			//WebElement textbox1 = driver.findElement(By.cssSelector("input[tabindex='1']"));
			//textbox1.sendKeys("100");
			//WebElement textbox2 = driver.findElement(By.cssSelector("input[tabindex='2']"));
			//textbox2.sendKeys("200");	
		
			
			driver.navigate().to("https://demo.actitime.com/login.do");
           //WebElement textbox = driver.findElement(By.cssSelector("input#username.textField"));
		//WebElement pass = driver.findElement(By.cssSelector("input.textField.pwdfield"));
		//textbox.sendKeys("admin");
		//pass.sendKeys("manager");
	//WebElement login = driver.findElement(By.cssSelector("td#loginButtonContainer"));
			
			
	           WebElement textbox = driver.findElement(By.xpath("input#username.textField"));
			WebElement pass = driver.findElement(By.xpath("input.textField.pwdfield"));
			textbox.sendKeys("admin");
			pass.sendKeys("manager");
		WebElement login = driver.findElement(By.xpath("td#loginButtonContainer"));
			login.click();
		}

	}


