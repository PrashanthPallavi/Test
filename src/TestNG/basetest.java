package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basetest {
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
@AfterMethod
public void postcondition()
{
	driver.close();
}
}
