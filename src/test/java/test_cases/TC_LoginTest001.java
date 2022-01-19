package test_cases;

import org.junit.Assert;
import org.testng.annotations.Test;

import page_objects.LoginPage;

public class TC_LoginTest001 extends Base_Class
{
	@Test
	public void loginTest()
	{
		
	  
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		
		
		lp.setPassword(password);
		
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			
		}
		
		
	}

}
