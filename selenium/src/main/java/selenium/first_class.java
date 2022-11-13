package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		//		WebDriver driver= new ChromeDriver();
		//		driver.get("https://www.orangehrm.com/");
		//		System.out.println("abc");
		////		
		File src = new File("");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook xsf = new XSSFWorkbook(fis);

		XSSFSheet sheet = xsf.getSheetAt(0);
		int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();

		System.out.println(rowcount);


		for(int i=1;i<=rowcount;i++)
		{
			int coloumn=sheet.getRow(i).getLastCellNum();

			for(int j=0;j<coloumn;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}

			System.out.println();
		}

		//		System.out.println(data);
		xsf.close();






	}

}
