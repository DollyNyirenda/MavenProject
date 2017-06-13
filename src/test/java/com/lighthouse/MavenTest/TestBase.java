package com.lighthouse.MavenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataDrivenHelper;
import utils.WebDriverHelper;


@SuppressWarnings("unused")
public class TestBase
{
	 
	  protected WebDriver driver; 
	  protected HomePage homePage;
	  protected Properties testConfig;
	  

	  @BeforeClass
	  public void beforeMethod() throws FileNotFoundException, IOException 
	  {  
		  testConfig = new Properties();
		  testConfig.load(new FileInputStream("Config.properties"));
		  		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dolly S Nyirenda\\Desktop\\Selenium\\Software\\Step 4\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		   
		// Create Firefox Driver with Marionette capabilities 
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox(); 
		 capabilities.setCapability("marionette", true); 
		 driver = new FirefoxDriver(capabilities); 
		 // Set implicit wait for 30 seconds
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		 //driver.get("http://www.trademe.co.nz"); 
		 // driver = WebDriverHelper.createDriver(testConfig.getProperty("browser"));
				 
		  //driver = new FirefoxDriver();
		  driver.get(testConfig.getProperty("baseUrl"));
		  
		  homePage = new HomePage(driver);
	  	 
	  }
	  

	  @DataProvider
	  public Object[][] dataProvider(Method method)
	  {
		DataDrivenHelper ddh = new DataDrivenHelper(testConfig.getProperty("mastertestdatafile"));
			
		Object[][] testData= ddh.getTestCaseDataSets(testConfig.getProperty("testdatasheet"), method.getName());
		
		return testData;
			
	  }
	  
	  @AfterClass
	  public void afterMethod() 
	  {
		  driver.close();
		  //WebDriverHelper.quitDriver(driver);
		 
	  }
}
