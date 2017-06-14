package com.lighthouse.MavenTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {
	@Test(dataProvider="dataProvider")
	public void testSuccesfulLogOut(String username, String password) throws Throwable{
		
		 boolean LogoutTestResult = homePage.clickLogin()
				 .loginAs(username,password)
				 .clickLogout()
				 .isLogoutSuccessful();
		 Assert.assertFalse(LogoutTestResult, "Still Logged In");

	}
}
