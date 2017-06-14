package com.lighthouse.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase
{
	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
	}

	public Motors searchMotors(){
		driver.findElement(By.xpath(config.motors)).click();
		return new Motors(driver);
}
	
	public boolean isLoginSuccessful() throws Throwable
	{
		//Thread.sleep(3000L);
		boolean actual = driver.findElement(By.xpath(config.logoutButton)).isDisplayed();
	    return actual;
	}
	
	public logOutPage  clickLogout(){
		 driver.findElement(By.xpath(config.logoutButton)).click();
		 return new logOutPage(driver);
	}
	
	//public boolean isLoginSuccessful(String username)
	//{
		//return driver.findElement(By.id("user_info")).getText().contains(username);
	//}

}
