package webdriver_BasicCode.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Option {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		
		new Select(driver.findElement(By.id("drpStock")))
		.selectByVisibleText("Gainers");

		
		new Select(driver.findElement(By.id("open_account")))
		.selectByVisibleText("NRI Account");
		
		
		//Select dropdown option using findelements 
		WebElement Dropdown=driver.findElement(By.id("open_account"));
		Dropdown.findElements(By.tagName("option")).get(6).click();
		
	}

}
