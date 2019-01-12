package webdriver_BasicCode.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Methods {

	public static void main(String[] args) 
	{
		/*
		 * SelectByvisibletext
		 * SelectByvalue
		 * SelectByIndex
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//select dropdown option using visible text
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("5");
		
		
		//select dropdown option using value 
		new Select(driver.findElement(By.id("day")))
		.selectByValue("6");
		
		
		//select dropdown option using index number
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(21);
		

	}

}
