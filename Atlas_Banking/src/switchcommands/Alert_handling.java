package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alert_handling {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		//Identify Element 
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		//Search_btn.click();
		Thread.sleep(5000);
		
		
		//Write a condition to verify alert presented at webpage
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			System.out.println("alert presented");

			//Switch to alert
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert
			String alertmsg=alert.getText();
			System.out.println(alertmsg);
			
			//close alert window
			alert.accept();
			
		}
		else
		{
			System.out.println("alert not presented");
		}
		
		
		
		

	}

}
