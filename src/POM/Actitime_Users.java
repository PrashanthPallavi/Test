package POM;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_Users {
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement Users;
	
	public Actitime_Users(WebDriver driver2) {
		
		PageFactory.initElements(driver2, this);
	}
public void clicklogout()
{
	this.logout.click();
	
}

public void clickusers() {
		
		this.Users.click();
		
	}
	


}




