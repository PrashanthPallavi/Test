package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime_enter_time_track {
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public actitime_enter_time_track(WebDriver driver2) {
		
		PageFactory.initElements(driver2, this);
	}
public void clicklogout()
{
	this.logout.click();

}
}

