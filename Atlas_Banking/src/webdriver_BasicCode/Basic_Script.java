package webdriver_BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Script 
{

	public static void main(String[] args) 
	{
		
		
		//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//launch chrome instance
		WebDriver driver=new ChromeDriver();
		//load webpage
		driver.get("http://facebook.com");
		//maximize window[Optional]
		driver.manage().window().maximize();
		
		/*
		 * Note:--> Webdriver is a common interface class. It can
		 * manipulate all browser instance suppored by selenium.
		 */
		
		
		//Identify editbox and type text in it
		driver.findElement(By.xpath("//input[@id='u_0_j']")).clear();
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("vijay");
	
		//Idenitfy editbox and type text in it
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Krishna");
		
		//Identify editbox and type text in it
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys("vijaykrishna@gmail.com");		
		
	}

}
