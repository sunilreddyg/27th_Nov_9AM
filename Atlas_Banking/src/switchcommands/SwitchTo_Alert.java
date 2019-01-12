package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		//Identify Element 
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Switch to alert
		Alert alert=driver.switchTo().alert();
		
		//Capture text on alert
		String alertmsg=alert.getText();
		System.out.println(alertmsg);
		
		//close alert window
		alert.accept();
		
		
		/*
		 * Capture text on alert window
		 * 
		 * 	driver.switchTo().alert().getText();
		 * 
		 * Accept popup window    [It close window]
		 * 	
		 * 	driver.switchTo().alert().accept();
		 * 
		 * Dismiss alert window   [It close window]
		 * 
		 * 	driver.switchTo().alert().dismiss();
		 * 
		 * Send text to popup-window  [Prompt window]
		 * 
		 * 	driver.switchTo().alert().sendkeys("text");
		 */
		
		
		
		
		/*
		 * Alert Exceptions:-->
		 * 	
		 * 		UnhandledAlertException
		 * 		NoalertpresentedException
		 */
		

	}

}
