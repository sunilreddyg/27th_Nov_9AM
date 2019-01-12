package datadriver_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_User_Conditions {

	public static void main(String[] args) throws IOException {
		
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//Get Sheet acces using above book referal
		XSSFSheet sht=book.getSheet("Sheet4");
		
		
		//Get number of rows data availabel under sheet
		int FRcount=sht.getFirstRowNum();
		int LRcount=sht.getLastRowNum();
		
		//Iterate for expected range
		for (int i = 5; i <= LRcount; i++) 
		{
			//Get execution status from excel
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			if(Exe_status.equalsIgnoreCase("y"))
			{
				
				//target row
				String username=sht.getRow(i).getCell(0).getStringCellValue();
				String password=sht.getRow(i).getCell(1).getStringCellValue();
				System.out.println(username+"  "+password);
				
				
				//Get Scenario type form Excel
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				
				if(Stype.equals("text"))
				{
					System.out.println("text captured");
				}
				else if(Stype.equals("alert"))
				{
					System.out.println("alert handled");
				}
				else if(Stype.equals("p"))
				{
					System.out.println("positive output captured");
				}
				else if(Stype.equals("n"))
				{
					System.out.println("negative outptu captured");
				}
				
				
			}
			
			
			
			
		
		}

	}

}
