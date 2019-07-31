package PACKAGE;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG6 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DRIVERS/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
	}}