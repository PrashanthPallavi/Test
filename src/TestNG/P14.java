package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P14 {

		@Test()
		public void loginscript()
		{
			Reporter.log("loginscript", true);  
		}
		
		@Test()
		public void home()
		{
			Reporter.log("home", false);
		}
	  @Test()
	  public void users()
	  {
		  System.out.println("users");
	  }

	  @Test()
	  public void Reports()
	  {
		  System.out.println("reports");
	  }

}






