 package PACK1;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo17 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebbok.com");
		TakesScreenshot t = (TakesScreenshot)driver;
		File src =t.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Photo/P1.png");
		FileUtils.copyFile(src, dst);
		}
}

