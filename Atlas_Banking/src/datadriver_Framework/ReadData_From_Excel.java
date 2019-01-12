package datadriver_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_From_Excel 
{
	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("workbook accessed");
		
		//Target sheet
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target row using above sheet
		XSSFRow row=sht.getRow(1);
		
		//Target cell using row 
		XSSFCell cell=row.getCell(0);
		
		//Get characters from cell
		String url=cell.getStringCellValue();
		System.out.println(url);
		
		//get characters from cell
		String CustomerID=row.getCell(1).getStringCellValue();
		
		
		//get Mobile number [Convert mobile number to string manually in excel]
		String mobile=row.getCell(3).getStringCellValue();
		System.out.println("Mobile number in String foramt is => "+mobile);
		
		//Get Decimal value from cell
		Double price=row.getCell(4).getNumericCellValue();
		System.out.println("Price in double format is => "+price);
		//Convert double format to integer
		int price_in_int=price.intValue();
		System.out.println("price in integer format is => "+price_in_int);
		
		
		
	}

}
