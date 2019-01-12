package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeCss_Path 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://yahoomail.com");
		driver.manage().window().maximize();
		
		
		//Identify Element with cssSelector
		WebElement username=driver.findElement(By.cssSelector("div[id='username-country-code-field'] > input"));
		username.clear();
		username.sendKeys("sunilreddy@yahoomail.com");
		
		
		//Identify Element with css-position
		WebElement Next_btn=driver.findElement(By.cssSelector("form[id='login-username-form'] > input[type='submit']"));
		Next_btn.click();
	}

}
