package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Frame_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Identify signin button
		WebElement Signin_btn=driver.findElement(By.className("login-btn"));
		Signin_btn.click();
		Thread.sleep(5000);
		
		
		//identify frame
		WebElement ModalFrame=driver.findElement(By.className("modalIframe"));
		//Apply switch to frame using webelement referal
		driver.switchTo().frame(ModalFrame);
		
		
		//identify mobile number under frame
		WebElement Mobile_editbox=driver.findElement(By.id("mobileNoInp"));
		Mobile_editbox.clear();
		Mobile_editbox.sendKeys("9030248855");
		Thread.sleep(5000);
		
		
		
		//switch control back to mainapge
		driver.switchTo().defaultContent();
		
		
		//Close frame window
		WebElement Close_btn=driver.findElement(By.cssSelector("#login_frame > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
		Close_btn.click();
		
		
		
	}

}
