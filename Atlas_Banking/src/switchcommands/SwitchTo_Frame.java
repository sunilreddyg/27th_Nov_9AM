package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		
		
		//Switch controls from page to frame
		driver.switchTo().frame("modal_window");
		
		//Identify Email editbox
		WebElement email_editbox=driver.findElement(By.id("email"));
		email_editbox.clear();
		email_editbox.sendKeys("sunilreddy@gmail.com");
		
		//Enter trip ID
		WebElement tripID=driver.findElement(By.id("tripidSecond"));
		tripID.clear();
		tripID.sendKeys("564564");
		
		
		//get controls back to mainpage
		driver.switchTo().defaultContent();
		
		//Identify location at webpage
		driver.findElement(By.linkText("Flights")).click();
	}

}
