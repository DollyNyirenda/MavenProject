package com.lighthouse.MavenTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {
	@Test
	public void testSuccesfulLogOut() throws Throwable{
		
		 boolean LogoutTestResult = homePage.clickLogin()
				 .loginAs("sepiso.nyirenda@gmail.com", "Nicole&2009").clickLogout("sepiso.nyirenda@gmail.com")
				 .isLogoutSuccessful("sepiso");
		 Assert.assertFalse(LogoutTestResult, "Still Logged In");

	}
}
