package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> list= driver.findElements(By.tagName("a"));
		
		System.out.println(list);
		System.out.println("size of the element is "+list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String element=list.get(i).getAttribute("href");
			System.out.println(element);
			
			URL link = new URL(element);
			
			HttpURLConnection con= (HttpURLConnection) link.openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("200 status code valid link");
				System.out.println(element);
			}
			else
			{
				System.out.println("broken link");
			}
			
		}
	
		}
	}


