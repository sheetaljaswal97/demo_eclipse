package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class chrome_data   {
	
	public static WebDriver  driver1;
	public static WebDriver  driver;
	static WebElement element;
	static String path=System.getProperty("user.dir") +"\\Extent_report\\ExtentReport.html";
    static	ExtentSparkReporter htmlReporter;
    static	ExtentReports reports;
    static	ExtentTest test;
    
//@BeforeTest
//public void chrome() 
//{
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
//    driver= new ChromeDriver();
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.manage().window().maximize();
//}
	
	
	public static void StartReport(String Testcase)
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
		test  =reports.createTest(Testcase);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	}
	
	public static void recover_scenario(String method_name, Exception exception)
	{
	System.out.println("Recovery scenario run for method name "+method_name);
	System.out.println("Recovery scenario eun for the exception name "+exception);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sheetal.jaswal\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	driver1=new ChromeDriver();
	driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver1.manage().window().maximize();

	}

	public static void byattribute_click(String locators,String action)
	{
		element=driver.findElement(By.xpath(locators));
		try
		{  
			element.click();
			test.log(Status.PASS, "pass the "+action);
			reports.flush();
		}
		catch(Exception e)
		{
			test.log(Status.FAIL, "Fail the "+action);
			reports.flush();
		}
	}
	
	
	public static void byattribute_sendKeys(String locators,String action,String data)
	{
		element=driver.findElement(By.xpath(locators));
		try
		{   
			element.sendKeys(data);
			test.log(Status.PASS, "pass the "+action);
			
		}
		catch(Exception e)
		{
			test.log(Status.FAIL, "Fail the "+action);
			reports.flush();
		}
	}
	
	
	}




