package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_sheetal_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src = new File("C:\\Users\\hp\\OneDrive\\Desktop\\second.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf= new XSSFWorkbook(fis);
		XSSFSheet sheet=xsf.getSheetAt(0);
		for(int i=0;i<=1;i++)
		{
		String data=sheet.getRow(0).getCell(i).getStringCellValue();
		
		System.out.println(data);
		}	
		xsf.close();

	}

}
