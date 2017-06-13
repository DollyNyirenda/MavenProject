package com.lighthouse.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isLoginPageDisplayed()
	{
		return driver.findElement(By.xpath(config.username)).isDisplayed();			
	}

	public MyAccountPage loginAs(String username, String password) throws Exception {
		 	      
		driver.findElement(By.xpath(config.username)).click();
		driver.findElement(By.xpath(config.username)).sendKeys(username);
		//driver.findElement(By.xpath(config.password)).click();
		driver.findElement(By.xpath(config.password)).sendKeys(password);
		driver.findElement(By.xpath(config.login)).click();
		
		return new MyAccountPage(driver);
	}


	
}
