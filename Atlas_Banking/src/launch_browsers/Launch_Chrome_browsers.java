package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_browsers 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe to launch chrome browser.
		 * 
		 * 	 URL:--> https://www.seleniumhq.org/download/
		 * 	 => Under third party drivers download "Google-chrome-driver"
		 * 	 => At downlods page click on latest release
		 * 	 => Download chromedriver.zip file at index page.
		 * 	 => unzip file to project location.
		 * 
		 * 	Download from Index page:-->
		 * 
		 * 			https://chromedriver.storage.googleapis.com/index.html?path=2.44/
		 * 	 
		 */
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://google.com");
		

	}

}
