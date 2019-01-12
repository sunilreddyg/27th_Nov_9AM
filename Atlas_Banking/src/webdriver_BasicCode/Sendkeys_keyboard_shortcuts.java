package webdriver_BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_keyboard_shortcuts 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify firstname editbox
		driver.findElement(By.name("firstname"))
		.sendKeys("Vijay",Keys.TAB,
				"Krishna",Keys.TAB,
				"vijaykrishna@gmail.com",Keys.TAB,
				"vijaykrishna@gmail.com",Keys.TAB,
				"Hello12345");
		
		//select dropdown option using keyboard shortcuts
		driver.findElement(By.id("day")).sendKeys("23");
		
		
		//select dropdown option using keyboard shortcut
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
	}

}
