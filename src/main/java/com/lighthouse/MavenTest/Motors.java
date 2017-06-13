package com.lighthouse.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Motors extends PageBase {
	public Motors(WebDriver driver) {
		super(driver);
		}

	public boolean isMotorsPageDisplayed()
	{
		return driver.findElement(By.xpath(".//*[@id='form1']/h1")).getText().contains("Browse cars, bikes & boats");
	}
}
