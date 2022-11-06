package selenium;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windows {

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
	
		ArrayList<String> child_window=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(child_window);
		Thread.sleep(2000);
		
		Iterator<String> it = child_window.iterator();
		
		while(it.hasNext())
		{
			String childwindow =it.next();
			if(!parent_handle.equals(childwindow))
			{
				driver.switchTo().window(child_window.get(1));
				Thread.sleep(1000);
				driver.manage().window().maximize();
				driver.close();
			}
		}
		
		driver.quit();
		

	}

}
