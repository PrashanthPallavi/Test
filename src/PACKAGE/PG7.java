package PACKAGE;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG7 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DRIVERS/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
        for(String handle:handles)
        {
        	driver.switchTo().window(handle);
        	String title = driver.getTitle();
        	System.out.println(title);
        	if(title.equals("Amazon"))
        	driver.close();
        	//Thread.sleep(1000);
        	
        }
	
}
}
