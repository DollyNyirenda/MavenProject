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
		driver.findElement(By.id("searchString")).sendKeys("Motors");
		driver.findElement(By.className("btn btn-trademe")).submit();
		return new Motors(driver);
}
	
	public boolean isLoginSuccessful() throws Throwable
	{
		//Thread.sleep(3000L);
		boolean actual = driver.findElement(By.xpath(config.accountname)).getText().contains("Sepisodolly");
	    return actual;
	}
	
	public logOutPage  clickLogout(String username){
		 driver.findElement(By.xpath(".//*[@id='container']/div[1]/div[1]/div[2]/div/p/a")).click();
		return new logOutPage(driver);
	}
	
	//public boolean isLoginSuccessful(String username)
	//{
		//return driver.findElement(By.id("user_info")).getText().contains(username);
	//}

}
