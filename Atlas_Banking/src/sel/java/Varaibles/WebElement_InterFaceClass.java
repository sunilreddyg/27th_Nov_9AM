package sel.java.Varaibles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElement_InterFaceClass 
{

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Location with ID property
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		
		//Identify webElement and store into referal.
		WebElement password_editbox=driver.findElement(By.id("pass"));
		password_editbox.clear();
		password_editbox.sendKeys("hello12345");
		
		
		//Identify location
		By Login_btn_locator=By.id("loginbutton");
		//Identify Webelement at webpage
		WebElement Login_btn=driver.findElement(Login_btn_locator);
		Login_btn.click();
		
		//Verify Expected conditions
		ExpectedConditions.visibilityOfElementLocated(Login_btn_locator);

	}

}
