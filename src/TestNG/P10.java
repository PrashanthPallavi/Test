package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P10 {

		@Test(groups= {"smoke"})
		public void loginscript()
		{
	     System.out.println("loginscript");
		Assert.fail();
		}
		
		@Test(groups= {"smoke","functional"}) 
		public void users()
		{
			System.out.println("users");
		}
		
	  @Test(groups= {"adhoc"},dependsOnGroups= {"smoke"})  
	  public void home()
	  {
		  System.out.println("home");
	  }
	  
	  @Test(groups= {"adhoc"},dependsOnGroups= {"smoke"})  
	  public void Reports()
	  {
		  System.out.println("Reports");
	 }
}



