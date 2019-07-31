package TestNG;

import org.testng.Assert;

import org.testng.annotations.Test;

public class P9 {

		@Test()
		public void loginscript()
		{
			System.out.println("method1");
		//Assert.fail();    //fail this login script
		}
		
		@Test(dependsOnMethods= {"loginscript"})   //depending on login script
		public void users()
		{
			System.out.println("method2");
		}
		
	  @Test(dependsOnMethods= {"loginscript","users"})  // you can select multiple script dependencies 
	  public void home()
	  {
		  System.out.println("method3");
	  }
	}




