package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TO_VERIFY_IMAGE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub //	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		WebElement element=driver.findElement(By.xpath("//*[@id='app']//following::img[@alt='company-branding']"));		
		String img=element.getAttribute("src");		
		System.out.println(img);	
		if(img.contains("ohrm_branding.png"))
		{
			System.out.println("Image verified");
		}
		else
		{
			System.out.println("Not verified");
		}
	}

}
