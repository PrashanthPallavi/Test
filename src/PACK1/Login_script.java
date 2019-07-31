package PACK1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.ActiTIME_Login;
import POM.Actitime_Users;
import POM.Data;
import POM.actitime_enter_time_track;

public class Login_script {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","./DRIVERS/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		ActiTIME_Login ob = new ActiTIME_Login(driver);
		//ob.setusername("admin");
       //ob.setpassword("manager");
       // ob.clicklogin();
        
	ob.setusername(Data.getdata("sheet1",0,0));
   ob.setpassword(Data.getdata("sheet1",1,0));
	ob.clicklogin();
	




		//actitime_enter_time_track ob1 = new actitime_enter_time_track(driver);
		//ob1.clicklogout();
	


		
        Actitime_Users ob1= new Actitime_Users(driver);
		ob1.clickusers();
  
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		try {
			wait.until(ExpectedConditions.titleContains("Users"));
				System.out.println("pass: users page is loaded");
		}
		catch (Exception e) {
			System.out.println("fail: users page is not loaded");		
}
}}


	
	



