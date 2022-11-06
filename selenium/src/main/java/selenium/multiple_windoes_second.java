package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_windoes_second {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='windowButton']")).click();
		Thread.sleep(2000);
		String parent_handle=driver.getWindowHandle();
		System.out.println(parent_handle);
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		Set<String> child_window=driver.getWindowHandles();
		
		Iterator<String> it=child_window.iterator();
		
		while(it.hasNext())
		{
			String childwindow=it.next();
			System.out.println(childwindow);
			
			if(!parent_handle.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle());
				driver.quit();
			}
			
		}
		
		driver.quit();
	

	}

}
