package com.lighthouse.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarsPage extends PageBase {
	
	public CarsPage(WebDriver driver) {
		super(driver);
	}

	public boolean isCarsPageDisplayed() {
		
		return driver.findElement(By.xpath(config.carsPage)).getText().contains("Search results for");
	
	}


}
