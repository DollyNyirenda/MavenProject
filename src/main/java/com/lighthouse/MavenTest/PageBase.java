package com.lighthouse.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class PageBase
{

	protected WebDriver driver;
	Configuration config = new Configuration();
		
	public PageBase(WebDriver driver) 
	{
		this.driver=driver;
	}

	public String getTilte()
	{
		return driver.getTitle();
	}
}
