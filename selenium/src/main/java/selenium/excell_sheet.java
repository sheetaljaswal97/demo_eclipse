package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excell_sheet {

	
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.google.com/");
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
	
	public static void main(String[] args) throws IOException, InterruptedException
	
	{
		
		File src = new File("C:\\Users\\hp\\OneDrive\\Desktop\\second.xlsx");
		FileInputStream fis = new FileInputStream(src);	
		XSSFWorkbook xsf = new XSSFWorkbook(fis);	
		XSSFSheet sheet = xsf.getSheetAt(0);
	
			
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(data);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='wM6W7d']/span[text()='one business consulting group']")).click();
		
		
		Thread.sleep(3000);
		xsf.close();

		
		
		
	}
//		
		
	}


