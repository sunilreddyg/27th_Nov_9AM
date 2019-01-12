package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_browser 
{

	public static void main(String[] args) 
	{
		/*
		 * To launch firefox browser download geckodriver.exe file
		 * 
		 * 	URL:=> https://www.seleniumhq.org/download/
		 * 		   Under third party drivers click on "Mozilla gecodriver" link
		 * 		   Under Gitrepository website click on releases
		 * 			
		 * 
		 * Alternal URL:--> https://github.com/mozilla/geckodriver/releases
		 * 					Download geckodriver release version --> v0.21.0  [for 57 and greater]
		 * 					Download file w.r.t  Os and hotspot size
		 * 					After download finished unzip file location to project folder..
		 *  
	     */
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://facebook.com");
		
		
		

	}

}
