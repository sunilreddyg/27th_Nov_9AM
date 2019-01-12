package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_handling {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		//Identify Element 
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		//Search_btn.click();
		Thread.sleep(5000);
		
		
		try {
		
			//Switch to alert
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert
			String alertmsg=alert.getText();
			System.out.println(alertmsg);
			
			//close alert window
			alert.accept();
	
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
