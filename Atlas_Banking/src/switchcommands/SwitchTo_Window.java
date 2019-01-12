package switchcommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window 
{

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Get current window Dynamic ID
		String MainwindowID=driver.getWindowHandle();
		
		//Click External link to open new window
		driver.findElement(By.linkText("Instagram")).click();
		Thread.sleep(5000);
		
		//Get All window Dynamic ID's open by WebDriver.
		Set<String> AllwindowIDs=driver.getWindowHandles();
		
		//Apply foreach loop
		for (String EachWindow : AllwindowIDs) 
		{
			driver.switchTo().window(EachWindow);
		}
		
		System.out.println("Current focused window is => "+driver.getTitle());
		
		//identify element at instagram window
		WebElement Email=driver.findElement(By.name("emailOrPhone"));
		Email.clear();
		Email.sendKeys("9030248855");
		Thread.sleep(5000);
		
		//Close Private window
		driver.close();
		
		//Switch controls back to mainapge
		driver.switchTo().window(MainwindowID);
		
		System.out.println("Currnet focused window is => "+driver.getTitle());
		
		

	}

}
