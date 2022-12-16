package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.manage().deleteAllCookies();
	    WebElement element=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	    Actions action = new Actions(driver);
	    action.contextClick(element).build().perform();
	    WebElement doubleclick=driver.findElement(By.xpath("//*[@id='doubleClickBtn' and text()='Double Click Me']"));
	    action.doubleClick(doubleclick).build().perform();
	    WebElement clickme=driver.findElement(By.xpath("//*[ text()='Click Me']"));
	    action.click(clickme).build().perform();
	    WebElement getText=driver.findElement(By.xpath("//*[@id='rightClickMessage' and text()='You have done a right click']"));
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].style.background='yellow'", getText);
	    WebElement getText1=driver.findElement(By.xpath("//*[@id='doubleClickMessage' and text()='You have done a double click']"));
	    JavascriptExecutor js1= (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].style.background='red'", getText1);
	    WebElement getText2=driver.findElement(By.xpath("//*[@id='dynamicClickMessage' and text()='You have done a dynamic click']"));
	    JavascriptExecutor js2= (JavascriptExecutor) driver;
	    js2.executeScript("arguments[0].style.background='pink'", getText2);

	}

}
