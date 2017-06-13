package com.lighthouse.MavenTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class HomePageTest extends TestBase{
	
  @Test
  public void verifyHomeTest() {
	  boolean HomePageResult =  homePage.isHomePageDisplayed();
      Assert.assertTrue(HomePageResult, "Home Page Succesfully displayed");
	  
  }
  
 
}
