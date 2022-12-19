package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_data {
	
	public static WebDriver  driver1;
	public static void recover_scenario(String method_name, Exception exception)
	{
	System.out.println("Recovery scenario run for method name "+method_name);
	System.out.println("Recovery scenario eun for the exception name "+exception);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sheetal.jaswal\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	driver1=new ChromeDriver();
	driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver1.manage().window().maximize();

	}


}
