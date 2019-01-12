package webdriver_BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify link using orignal name
		driver.findElement(By.linkText("About Us")).click();
		
		
		//Identify link using original name
		driver.findElement(By.linkText("Jobs")).click();
		
		
		//Identify link using original name
		driver.findElement(By.linkText("Job Openings")).click();
		
		//Identify link using partial name
		driver.findElement(By.partialLinkText("Executive – Travel Facilitator (Implant)")).click();
		
		
		
		
		
		
	}

}
