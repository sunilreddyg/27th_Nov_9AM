package datadriver_Framework.csvfiles;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadData_From_CsvFiles {

	public static void main(String[] args) throws IOException 
	{
		//Target file location\
		String filepath="src\\datadriver_Framework\\csvfiles\\";
		FileReader fr=new FileReader(filepath+"InputData.csv");
		System.out.println("file located");
		

		//Create object csvreader
		CSVReader reader=new CSVReader(fr);
		
		//Read next record in table format
		String header[]=reader.readNext();
		System.out.println(header[0]+"    "+header[1]);
		
		//write condition loop to iterate until next record null
		String record[];
		while((record=reader.readNext())!=null)
		{
			System.out.println(record[0]+"   "+record[1]);
			
			
		}
		
		
		
		
	}

}
