package datadriver_Framework.notepad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_From_Notepad_File {

	public static void main(String[] args) throws IOException
	{
		//Target file location
		String filepath="src\\datadriver_Framework\\notepad\\";
		FileReader fr=new FileReader(filepath+"InputData.txt");
		System.out.println("file located");
		
		//Create object for Bufferred reader
		BufferedReader reader=new BufferedReader(fr);
		
		//using read next line
		String line_header=reader.readLine();
		System.out.println(line_header);
	
				
		int i=0;
		String line;
		//writing condition based loop to iterate until flat file have no records
		while((line=reader.readLine())!=null)
		{
			
			i=i+1;
			if(i==2)
			{
				  String arr[]=line.split(",");
				  System.out.println("username is => "+arr[0]);
				  System.out.println("username is => "+arr[1]);
			}
		}
		

	}

}
