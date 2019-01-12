package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_navigationCommands {

	public static void main(String[] args) throws Exception 
	{
		
		//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//set url at address bar
		driver.navigate().to("http://facebook.com");
		
		driver.findElement(By.linkText("Messenger")).click();
		Thread.sleep(4000);
		
		
		//Navigate back to homepage
		driver.navigate().back();
		Thread.sleep(4000);
		
		
		//Navigate to Next page
		driver.navigate().forward();
		
		
		//Refresh page
		driver.navigate().refresh();
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
