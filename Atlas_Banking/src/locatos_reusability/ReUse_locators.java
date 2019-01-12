package locatos_reusability;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReUse_locators {

	public static void main(String[] args)
	{
		
		
		//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(Locators.uid_locator).clear();
		driver.findElement(Locators.uid_locator).sendKeys("9030248855");
		
		driver.findElement(Locators.pwd_locator).clear();
		driver.findElement(Locators.pwd_locator).sendKeys("Hello");
		
		driver.findElement(Locators.login_btn_locator).click();
	}

}
