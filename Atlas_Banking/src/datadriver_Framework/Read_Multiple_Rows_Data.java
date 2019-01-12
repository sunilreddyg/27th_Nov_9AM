package datadriver_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Multiple_Rows_Data 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//Get Sheet acces using above book referal
		XSSFSheet sht=book.getSheet("Sheet3");
		
		
		//Get number of rows data availabel under sheet
		int FRcount=sht.getFirstRowNum();
		int LRcount=sht.getLastRowNum();
		
		//Iterate for expected range
		for (int i = 5; i <= LRcount; i++) 
		{
			//target row
			String username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"  "+password);
			
			
			//Get dynamic cell count at Each dynamic row
			int CellCount=sht.getRow(i).getLastCellNum();
			System.out.println("Cell Count available at Dynmaic row => "+CellCount);
			
			//Create a new line at console
			System.out.println("\n");
			
		}
		
		
		
		


	}

}
