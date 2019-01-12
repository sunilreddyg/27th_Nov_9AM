package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen {

	public static void main(String[] args) throws IOException
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		/*
		 * To access local utilites like [files and folders]
		 * we need to configure below executable jar files to
		 * current selenium project..
		 * 
		 *   URL:-->https://commons.apache.org/proper/commons-io
		 *   								/download_io.cgi
		 * 	
		 */
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\image.png"));
		

	}

}
