package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_pageSource {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Get Runtime pagesource
		String Runtime_Source=driver.getPageSource();
		System.out.println(Runtime_Source);
		
		
		//Verify Element presented at source
		if(Runtime_Source.contains("Projects"))
		{
			WebElement projects=driver.findElement(By.linkText("Projects"));
			projects.click();
		}
		else
			System.out.println("element not presented at source");
		

	}

}
