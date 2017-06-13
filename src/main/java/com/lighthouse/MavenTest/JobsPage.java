package com.lighthouse.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JobsPage extends PageBase {
   
	public JobsPage(WebDriver driver) {
		super(driver);
	}

	public boolean isJobsPageDisplayed() {
		
		return driver.findElement(By.xpath(config.listAJob)).isDisplayed();
	
	}


}
