package PACK1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/search?itinerary=BLR-GOI-09/07/2019&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E");
		Thread.sleep(4000);
		 List<WebElement> fgtnos = driver.findElements(By.xpath("//p[@class='fli-code']"));
		 List<WebElement> prices = driver.findElements(By.xpath("//p[@class='fli-code']/../../..//span[@class='actual-price']"));
	
		for(int i=0; i<fgtnos.size(); i++) 
		{
			System.out.println(fgtnos.get(i).getText()+"="+prices.get(i).getText());
			
		}
			
}
}
