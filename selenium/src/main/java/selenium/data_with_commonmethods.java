package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import common.chrome_data;

public class data_with_commonmethods extends chrome_data {
	String path=System.getProperty("user.dir") +"\\Extent_report\\ExtentReport.html";
    static	ExtentSparkReporter htmlReporter;
    static	ExtentReports reports;
    static	ExtentTest test;
	
	@Test(priority = 1)
	public static void login() throws InterruptedException
	{
		chrome_data.StartReport("Test case Login");
		// TODO Auto-generated method stub		
		Thread.sleep(2000);
	    driver.manage().deleteAllCookies();
//	    WebElement element="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']";
	 
	    chrome_data.byattribute_sendKeys("//input[@name='username']", "Enter the username ", "Admin");
	    chrome_data.byattribute_sendKeys("//input[@name='password']", "Enter the Password ", "admin123");
	    chrome_data.byattribute_click("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']", "click on the login button");
	    ;
	   
	}
	
	
	@Test(priority = 2)
	public static void login1() throws InterruptedException
	{
		chrome_data.StartReport("Test case Login1");
		// TODO Auto-generated method stub		
		Thread.sleep(2000);
	    driver.manage().deleteAllCookies();
//	    WebElement element="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']";
	 
	    chrome_data.byattribute_sendKeys("//input[@name='username']", "Enter the username ", "Admin");
	    chrome_data.byattribute_sendKeys("//input[@name='password']", "Enter the Password ", "admin123");
	    chrome_data.byattribute_click("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']", "click on the login button");
	    Thread.sleep(4000);
	   
	}
		
}
