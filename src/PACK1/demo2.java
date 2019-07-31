package PACK1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

		static
		{
		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
				}
	public static void main(String[] args) throws Throwable
				{
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.facebook.com");
			        driver.manage().window().maximize();
	                //driver.manage().window().fullscreen();
				}
}

