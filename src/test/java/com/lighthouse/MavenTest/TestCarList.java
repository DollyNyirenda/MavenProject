package com.lighthouse.MavenTest;

import org.junit.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class TestCarList extends TestBase {
  @Test
public void verifyCarsList() {// displays list of options on dropdown
	 homePage.clickMotors().listCarsOnDropDown();
	  
  }
}
