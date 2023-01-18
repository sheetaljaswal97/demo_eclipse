package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_selenium_scripts {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//*[@name='username']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Admin'", element);
		WebElement element1=driver.findElement(By.xpath("//*[@name='password']"));
		js.executeScript("arguments[0].value='admin123'", element1);
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();", button);
		js.executeScript("arguments[0].style.background='yellow'", element);
		js.executeScript("arguments[0].style.background='red'", element1);
		
		
		
}

}
