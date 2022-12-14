package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_link {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			String links=list.get(i).getAttribute("href");
			System.out.println(links);
			
			URL url = new URL(links);
			
			HttpURLConnection abc = (HttpURLConnection) url.openConnection();
			
			if(abc.getResponseCode()==200)
			{
				System.out.println("valid links");
				System.out.println(links);
			}
			else
			{
				System.out.println("Invalid link");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		List<WebElement> list =driver.findElements(By.tagName("a"));
//		
//		System.out.println(list);
//	
//		for(int i=0;i<list.size();i++)
//		{
//			String links=list.get(i).getAttribute("href");			
//			URL url = new URL(links);
//			
//			HttpURLConnection URL = (HttpURLConnection) url.openConnection();
//			
//			if(URL.getResponseCode()==200)
//			{
//				System.out.println(links+ "   valid status code");
//			}
//			else
//			{
//				System.out.println(links+ "broken" +URL.getResponseCode());
//			}
//			
//		}
		
		
		
		

	}

}
