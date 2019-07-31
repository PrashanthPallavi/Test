package TestNG; //group by execute

import org.testng.Assert;

import org.testng.annotations.Test;

public class P11 {

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
		
	  @Test(groups= {"adhoc"})  
	  public void home()
	  {
		  System.out.println("home");
	  }
	  
	  @Test(groups= {"adhoc"})  
	  public void Reports()
	  {
		  System.out.println("Reports");
	 }
}



/* <?xml version="1.0" encoding="UTF-8"?>
// <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
// <suite name="Suite" parallel="tests">
 // <test name="Test">
  // <groups>
  // <run>
  // <exclude name="functional"> //include name="functional">
  // </exclude></run></groups>  //</exclude>
    // <classes>
      // <class name="TestNG.P11"/>
    // </classes>
  // </test> <!-- Test -->
// </suite> <!-- Suite -->
*/