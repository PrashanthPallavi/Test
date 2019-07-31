package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_Login {
	@FindBy(id="username")   
    //public WebElement username;
	private WebElement username;
	
	@FindBy(name="pwd")
	//public WebElement password;
	private WebElement password;
	
	
	@FindBy(id="loginButton")
	//public WebElement loginButton;
	private WebElement loginButton;
	
	public ActiTIME_Login(WebDriver driver1) {   //constructor
	
		PageFactory.initElements(driver1, this);  //this is used to current object non static variable 		
	}
	
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	
public void setpassword(String pw)
{
	this.password.sendKeys(pw);
	
}

public void clicklogin()
{
	this.loginButton.click();
}
}

