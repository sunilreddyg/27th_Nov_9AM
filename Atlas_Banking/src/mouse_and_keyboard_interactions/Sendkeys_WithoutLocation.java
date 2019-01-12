package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_WithoutLocation 
{

	public static void main(String[] args) 
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com/free-job-alerts");
			driver.manage().window().maximize();
			
			
			//identify location
			WebElement Min_sal=driver.findElement(By.id("minsal_dd_cja"));
			Min_sal.click();
			
			//Enable keyboard interaction at automation browser
			Actions action=new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ENTER).perform();
			
			
			
			
			
	}

}
