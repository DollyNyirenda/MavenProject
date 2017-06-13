package com.lighthouse.MavenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.lighthouse.MavenTest.HomePage;
import utils.DataDrivenHelper;
@SuppressWarnings("unused")
public class LoginTest extends TestBase {
	
@Test
public void loginPageTest(){
	 
	 boolean LoginPageTest = homePage.clickLogin().isLoginPageDisplayed();
	 Assert.assertTrue(LoginPageTest, "Login Page Succesfully displayed");
}
@Test(dataProvider="dataProvider")
	 public void testSuccessfullLogin(String username, String password) throws Throwable {
	 // Set implicit wait for 30 seconds
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		boolean LoginTestResult = homePage.clickLogin()
				 .loginAs(username,password)
				 .isLoginSuccessful();
 		   Assert.assertTrue(LoginTestResult, "Not Succesfully Logged In");
       		}
	

  }
