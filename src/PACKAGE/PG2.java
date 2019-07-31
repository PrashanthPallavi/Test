package PACKAGE;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PG2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DRIVERS/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");

		

	}

}
