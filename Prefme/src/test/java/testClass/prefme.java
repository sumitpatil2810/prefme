package testClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsers.Base;
import pomClass.ChechInandCheckOut;
import pomClass.Homepage;
import pomClass.LoginPage;
import utils.Utility;

public class prefme
{
	WebDriver driver;
	LoginPage login;
	Homepage homepage;
	ChechInandCheckOut checkinandout;
	int row=1;
	SoftAssert soft;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@Parameters("browserName")
	
	@BeforeTest
	public void launchbrowser(String browser)
	{
		
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		
		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
			driver=Base.openChromeBrowser();
			
		}
		if(browser.equals("Edge"))
		{
			driver = Base.openEdgeBrowser();
		}
		
//		if(browser.equals("Firefox"))
//		{
//			driver=Base.openFirefoxBrowser();
//		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@BeforeClass
	public void createpomobject()
	{
		login = new LoginPage(driver);
		homepage = new Homepage(driver);
	}
	
	@BeforeMethod
	public void logintoApplication() throws InterruptedException, IOException
	{
		driver.get("https://prefme.in/partner/#/login");
	//	driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String data=Utility.getDataFromExcelsheet("Sheet1", 1, 0);
		login.username(data);
		
		data=Utility.getDataFromExcelsheet("Sheet1", 1, 1);
		login.pass(data);
		
		login.login();
		
		Thread.sleep(5000);
			
		soft= new SoftAssert();
	}
//	@Test()
//	public void verifytab()
//	{
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		
//		String url = driver.getCurrentUrl();
//		String title = driver.getTitle();
//		
//		Assert.assertEquals("https://prefme.in/partner/#/login", url);
//
//		Assert.assertEquals("Hotel Partner", title);
//		
//		row++;
//		
		
	//}
	
	@Test
	public void verifyCheckinAndCheckOut() throws Exception 
	{
        
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		Assert.assertEquals("https://prefme.in/partner/#/dashboard", url);
		Assert.assertEquals("Oneguest Partner", title);
		row++;
		
//		soft.assertEquals("https://prefme.in/partner/#/dashboard", url);
//
//		soft.assertEquals("Oneguest Partner", title);
//		soft.assertAll();
		
//		
//        checkinandout.open();
//        
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        
//        checkinandout.AddNewReservation();
//        
//        checkinandout.CheckInDate();
//        checkinandout.CheckOutDate();
//        
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        checkinandout.name();
//        
//        
//        checkinandout.rooms();
//        checkinandout.adult();
//        checkinandout.child();
//
//        
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        
//        checkinandout.BookingStatus();
//        checkinandout.RoomCategory();
//        
//        checkinandout.FinalStep();
//        row++;

	}


	@AfterMethod
	public void logoutApplication(ITestResult result) throws IOException, InterruptedException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshot(driver,result.getName());
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		homepage.sumittab();
	
		homepage.Clicksonlogout();
	
		homepage.clickonYesTab();
		
	}
	@AfterClass
	public void clearObject()
	{
		login=null;
		homepage=null;
		
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.close();
		driver=null;
		System.gc();
	}


}
