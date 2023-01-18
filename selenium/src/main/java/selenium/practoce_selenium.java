package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class practoce_selenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized"); 
        option.addArguments("--incognito");
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, option);
        capabilities.setBrowserName("chrome");
        option.merge(capabilities);
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://www.softwaretestingmaterial.com");
        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        
        for(int i=0;i<list.size();i++)
        {
        String links=	list.get(i).getAttribute("href");
        System.out.println(links);
        
        URL url = new URL(links);
        HttpURLConnection all_links=(HttpURLConnection) url.openConnection();
        
        if(all_links.getResponseCode()==200)
        {
        	System.out.print("valid link "+all_links.getResponseMessage()+"    ");
        	System.out.println(links);
        }
        else
        {
        	System.out.print("invalid link "+all_links.getResponseMessage()+"    ");
        	System.out.println(links);
        }
        }
	}}
