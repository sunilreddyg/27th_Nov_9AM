package webdriver_BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		/*
		 * Note:--> Sendkeys command allow <"character sequences">
		 * 		and  <"keyboard shortcuts">
		 */
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		//Type Email and press Enter Keybord shortcut
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		//Wait for 5 seconds
		Thread.sleep(5000);
		
		//Type password and click on next button
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello123456",Keys.ENTER);

	}

}
