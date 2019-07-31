package PACK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//A-> ./html/body/div[1]/input[1]
		//B-> ./html/body/div[1]/input[2]
		//C-> ./html/body/div[2]/input[1]
		//D-> ./html/body/div[2]/input[2]
		//driver.navigate().to("https://www.facebook.com");
		//WebElement textbox = driver.findElement(By.xpath("//input[@type='email']"));
	//WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	//textbox.sendKeys("Pallavisshivageni@gmail.com");
		//pass.sendKeys("Sweetheartjanu@143");
		//WebElement login = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		
		//driver.navigate().to("https://www.makemytrip.com/flight/search?itinerary=BLR-GOI-06/07/2019&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E");
		//Thread.sleep(4000);
		 //WebElement element = (WebElement) driver.findElement(By.xpath("//p[text()='I5-1328']/../../..//span[@class='actual-price']"));
		//System.out.println(element.getText());
		//login.click();
		
		driver.get("https://www.flipkart.com/search?q=woodland&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2B_pmu']"));
		driver.findElement(By.xpath("//a[@class='_2mylT6']"));
		}
}
