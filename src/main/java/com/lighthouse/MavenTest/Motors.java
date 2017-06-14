package com.lighthouse.MavenTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Motors extends PageBase {
	public Motors(WebDriver driver) {
		super(driver);
		}

	public boolean isMotorsPageDisplayed()
	{
		return driver.findElement(By.xpath(config.motorspage)).isDisplayed();
	}
	
	public CarsPage searchCar(){
		driver.findElement(By.xpath(config.cardropdown)).sendKeys("Sedan");
		driver.findElement(By.xpath(config.searchButton)).click();
		return new CarsPage(driver);
	}
	//gets all options on dropdown list
	public void listCarsOnDropDown(){
	
		Select carList = new Select(driver.findElement(By.xpath(config.cardropdown)));
		List<WebElement> options = carList.getOptions();
		System.out.println(options.size());//number of items in dropdown
		
		for(int i=0; i < options.size(); i++){
			System.out.println(options.get(i).getText());
			
		}
	}
}
