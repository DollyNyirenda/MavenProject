package com.lighthouse.MavenTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MotorsTest extends TestBase {
	
  @Test
  public void verifyMotorsTest() {
	  boolean Motors =  homePage.clickMotors().isMotorsPageDisplayed();
	  Assert.assertTrue(Motors, "Motors Page is Not Succefsully displayed");
  }
}