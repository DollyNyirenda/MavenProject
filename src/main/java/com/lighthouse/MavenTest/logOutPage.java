package com.lighthouse.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logOutPage extends PageBase {
	
	
	public logOutPage(WebDriver driver) {
		super(driver);
	}

	public boolean isLogoutSuccessful()
	{
		return driver.findElement(By.xpath(config.logoutButton)).isDisplayed();
	}

}
