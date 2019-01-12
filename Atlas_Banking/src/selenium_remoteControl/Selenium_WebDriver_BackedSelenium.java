package selenium_remoteControl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Selenium_WebDriver_BackedSelenium 
{

	public static void main(String[] args)
	{
		
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		/*
		 * To write Rc scripting on webdriver browser download below
		 * 		executable jar file and configure to current project
		 * 
		 * 		URl:--> https://mvnrepository.com/artifact/
		 * 						org.seleniumhq.selenium/selenium-leg-rc/3.14.0
		 */
		
		//Enable Rc Scripting on webdriver browser.
		WebDriverBackedSelenium rc=new WebDriverBackedSelenium(driver, "http://facebook.com");
		
		
		//Type text into editbox using rc program
		rc.type("id=u_0_j", "Arjun");
		rc.type("css=#u_0_l", "vikram");
		rc.type("xpath=//input[@name='reg_email__']", "vikaram_newuser@gmail.com");
		
		//select dropdown using rc program
		rc.select("id=day", "13");
		rc.select("id=month", "Dec");
		rc.select("id=year", "1990");
		
		//click link
		rc.click("link=Messenger");
		
		
		
		/*
		 * Rc_work flow
		 * 
		 * 		URL:--> https://www.compendiumdev.co.uk/selenium/mindmap/Selenium-RC_Commands.html
		 * 		
		 */
		
		

	}

}
