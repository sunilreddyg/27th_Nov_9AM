package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_with_Class_Property {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Identify element with linktext
		driver.findElement(By.linkText("Sign in")).click();
		
		
		//Identify Element with class name property
		driver.findElement(By.className("form-control")).clear();
		driver.findElement(By.className("form-control")).sendKeys("sunilreddy.gajjala@outlook.com");		
		
		//click next button
		driver.findElement(By.className("btn-primary")).click();
	}

}
