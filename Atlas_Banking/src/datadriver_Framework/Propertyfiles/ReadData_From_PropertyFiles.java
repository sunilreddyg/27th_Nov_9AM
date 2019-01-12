package datadriver_Framework.Propertyfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadData_From_PropertyFiles 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file
		String filepath="src\\datadriver_Framework\\Propertyfiles\\Input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		
		//Create object for propery files
		Properties repository=new Properties();
		//load input data for Repository
		repository.load(fi);
		
		
		String appurl=repository.getProperty("url");
		System.out.println(appurl);
		
		
		String UID=repository.getProperty("username");
		System.out.println(UID);
		
		
		//Printing all keyset values..
		Set<Object> allkeys=repository.keySet();
		for (Object eachkey : allkeys) 
		{
			//convert object into string format
			String keyname=eachkey.toString();
			System.out.println(keyname);
		}
		
		
		
		
		
		
		
	}

}
