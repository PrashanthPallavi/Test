package PACK1;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	static
	{
	System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
	}
	public static void main(String[] args)
	{
	//it opens the browser
	  WebDriver driver = new ChromeDriver();
	  //SearchContext driver1 = new ChromeDriver();
	  //JavascriptExecutor driver2 = new ChromeDriver();
	  //TakesScreenshot driver3 = new ChromeDriver();

	//it will fetch specific web page
        driver.get("https://www.naukri.com");

	//returns url of the webpage
		//String url = driver.getCurrentUrl();
		 //System.out.println(url);
		 
	//returns the source code of the web page
	 //String ps = driver.getPageSource();
		// System.out.println(ps);
		 
	//title of the web pagehttps://www.naukri.com
		//String title = driver.getTitle();
			//System.out.println(title);
		 
	//returns unique reference address of each & every webpage 
				//String handle = driver.getWindowHandle();
				 //System.out.println(handle);
				 
	//returns unique reference address of each & every webpages 
			Set<String> handles = driver.getWindowHandles();
			System.out.println(handles);
			
			//it will close all the child windows from parent window
			//for(String handle:handles)
			{
			//driver.switchTo().window(handle);
			driver.close();
			//Thread.sleep(1000);
			//String title = driver.getTitle();
			//System.out.println(title);
			//if(!title.equals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"))
			{
				//driver.close();
			}
}
	}
}


