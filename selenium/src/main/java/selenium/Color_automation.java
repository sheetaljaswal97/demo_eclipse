package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Color_automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String color=driver.findElement(By.xpath("//*[@id='app']/header/a/img")).getCssValue("color");
		System.out.println(color);

	}

}
