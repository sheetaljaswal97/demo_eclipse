package Extent_Report_demo;

import org.openqa.selenium.devtools.v104.network.model.ReportStatus;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.junit.IJUnitTestRunner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Basic_Extent_Report_class {
	String path=System.getProperty("user.dir") +"\\Extent_report\\ExtentReport.html";
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void StartReport()
	{
		htmlReporter= new ExtentSparkReporter(path); //extent reports paths//
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add environment details//
		//configuration to change look and feel//
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
	}
	
	@Test
	public void LaunchBroweser() 
	{
		test  =	reports.createTest("Launch Browser and open url");
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void verifyTitle()
	{
		test = reports.createTest("verify title");
		Assert.assertTrue(false);
		test.log(Status.FAIL, "Fail");
	}
	
	@Test
	public void verifyLogo()
	{
		test = reports.createTest("verify Logo");
		Assert.assertTrue(true);
	}
	
	@Test
	public void verifyEmail()
	{
		test = reports.createTest("verify Email");
		throw new SkipException("skipping the test case with exception");
	}
	
	@Test
	public void verifyUsername()
	{
		test = reports.createTest("verify Username");
		Assert.assertTrue(true);
	}
	
	
	
	@AfterTest
	public void aftertest()
	{
		reports.flush();
	}

}
