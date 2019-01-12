package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Input_value {

	public static void main(String[] args) 
	{
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		//Identify location of email/mobile
		WebElement Email_editbox=driver.findElement(By.name("emailOrPhone"));
		
		//Enter mobile number
		Email_editbox.clear();
		Email_editbox.sendKeys("9030248855");

		
		//Capture mobile number
		String input=Email_editbox.getAttribute("value");
		System.out.println(input);
	}

}
