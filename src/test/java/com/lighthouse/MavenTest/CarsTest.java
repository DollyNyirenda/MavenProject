package com.lighthouse.MavenTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarsTest extends TestBase {
	 @Test
	  public void verifyCarsTest() {
		  boolean Cars = homePage.clickMotors().searchCar().isCarsPageDisplayed();
		  Assert.assertTrue(Cars, "Cars Page is Not Succefsully displayed");
	  }
}
