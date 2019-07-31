package PACKAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG4 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DRIVERS/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String ps = driver.getPageSource();
		System.out.println(ps);
	}}