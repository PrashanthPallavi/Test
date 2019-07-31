package PACK1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=woodland&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Thread.sleep(3000);
		List<WebElement> brands = driver.findElements(By.xpath("//div[text()='Woodland' and @class='_2B_pmu']"));
		List<WebElement> title = driver.findElements(By.xpath("//div[text()='Woodland' and @class='_2B_pmu']/..//a[@class='_2my1T6']"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[text()='Woodland' and @class='_2B_pmu']/..//div[@class='_1vC4OE']\"));"));
		for (int i=0; i<title.size();i++)
		{
			System.out.println(brands.get(i).getText()+"="+title.get(i).getText()+"="+prices.get(i).getText());
		}
			 
	}
}

		