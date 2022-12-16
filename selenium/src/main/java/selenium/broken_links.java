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

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Welcome to amazon website");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			String links=list.get(i).getAttribute("href");
			System.out.println(links);

			URL url = new URL(links);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			if(connection.getResponseCode()==200)
			{
				System.out.println("valid address" +connection.getResponseMessage());
				System.out.println(links);
			}
			else
			{
				System.out.println(links);
			}

		}




	}
}



