package launch_browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_Internet_Explorer_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * To launch IE browser download  IEDriverServer.exe file.
		 * 	URL:--> https://www.seleniumhq.org/download/
		 * 	Under the internetexplorer driver server
		 * 	download latest file w.r.t  hotspot size...  [32 bit or 64 bit]
		 * 	After download unzip file to project folder.
		 */
		
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
	}

}
