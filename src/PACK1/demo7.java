package PACK1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=woodland&sid=osp%2Ccil%2Ce1f&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3&as-pos=1&as-type=RECENT&as-searchtext=woo");
		 Thread.sleep(3000);
	    List<WebElement> suggestions = driver.findElements(By.xpath("//div[text()='Woodland' and @class='_2B_pmu']/..//a[@class='_2mylT6']"));
	    
	    for( WebElement a:suggestions)
	    {
	       System.out.println(a.getText());
	    		
	    	}
	    }
		
		//login.click();
	}

