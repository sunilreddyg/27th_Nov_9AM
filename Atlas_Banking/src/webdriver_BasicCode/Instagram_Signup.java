package webdriver_BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Signup 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		
		//Identfy editbox and type text into it
		driver.findElement(By.name("emailOrPhone")).clear();
		driver.findElement(By.name("emailOrPhone")).sendKeys("9030248855");
		
		
		//Identify fullname
		driver.findElement(By.name("fullName")).clear();
		driver.findElement(By.name("fullName")).sendKeys("vijay");
		
		//Identify username editbox
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Arjun");
		
	}

}
