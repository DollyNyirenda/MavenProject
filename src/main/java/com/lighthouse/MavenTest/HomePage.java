package com.lighthouse.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase 
{
	
	Configuration config = new Configuration();
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	public boolean isHomePageDisplayed()
	{
		return driver.findElement(By.id("LoginLink")).isDisplayed();			
	}
	
    public LoginPage clickLogin(){
    driver.findElement(By.id("LoginLink")).click();
    return new LoginPage(driver);
    }
    
    public Motors clickMotors(){
        driver.findElement(By.xpath(config.motors)).click();
        return new Motors(driver);
        }
    public JobsPage clickJobs(){
    	driver.findElement(By.xpath(config.jobs)).click();
    	return new JobsPage(driver);
    }
    
}
