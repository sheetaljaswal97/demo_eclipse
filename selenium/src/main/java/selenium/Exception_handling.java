package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import common.chrome_data;

public class Exception_handling {

	public static boolean unhandledException = false;
	public static WebDriver  driver;
	public static WebDriver  driver1;
	public static void main(String[] args) throws InterruptedException, IOException {
		if(unhandledException==false){
			System.out.println("***************************** createClient *********************************");
			try
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sheetal.jaswal\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				WebElement element_username=driver.findElement(By.xpath("//*[@name='username']"));
				JavascriptExecutor js=(JavascriptExecutor)driver ;
				js.executeScript("arguments[0].scrollIntoView(true);", element_username);
				element_username.sendKeys("Admin");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				WebElement element_password=driver.findElement(By.xpath("//*[@name='password']"));
				element_password.sendKeys("admin123");
				// js.executeScript("arguments[0].value='admin123';", element_password);
				WebElement login_button=driver.findElement(By.xpath("//*[@type='submit']"));
				js.executeScript("arguments[0].click();", login_button);
				Thread.sleep(2000);
				WebElement logo_img=driver.findElement(By.xpath("//*[@alt='client brand banner']"));
				js.executeScript("arguments[0].style.background='yellow'", logo_img);
				Thread.sleep(2000);
				String arr[]= {"Admin","PIiM","Leave","Time","Recruitment","Directory","Maintenance","Buzz"};
				for(int i=0;i<arr.length;i++)
				{
					WebElement element_text=driver.findElement(By.xpath("//*[@class='oxd-main-menu']//following::span[text()='"+arr[i]+"']"));
					js.executeScript("arguments[0].style.background='yellow'", element_text);
					js.executeScript("arguments[0].style.border='2px solid red'", element_text);
					Thread.sleep(2000);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src, new File(System.getProperty("user.dir") + "\\Screenshots.png"));
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				System.out.println("Exception is "+e);
				System.out.println("Name of current exception "+nameofCurrMethod);
				System.out.println(nameofCurrMethod);
				chrome_data.recover_scenario(nameofCurrMethod,e);
			}

		}


	}
}
