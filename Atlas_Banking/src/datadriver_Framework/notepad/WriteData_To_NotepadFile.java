package datadriver_Framework.notepad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData_To_NotepadFile {

	public static void main(String[] args) throws IOException 
	{
		
		//Create output file
		String filepath="src\\datadriver_Framework\\notepad\\";
		FileWriter fw=new FileWriter(filepath+"output.txt");
		System.out.println("file created");
		
		//create object for writter
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("9030248855");
		bw.newLine();
		
		bw.write("9030848855");
		bw.newLine();
		
		bw.write("9441245642");
		bw.newLine();
		
		bw.close();  //write and save data
		
		
		
		
	}

}
