package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_with_timeGap {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//click Link
		driver.findElement(By.linkText("Projects")).click();
		
		boolean flag;
		try {
			
			//Create object for Explicit wait
			WebDriverWait wait=new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.urlToBe("https://www.seleniumhq.org/projects/"));
			System.out.println("url verified");
			flag=true;
			
		} catch (TimeoutException e) {
			flag=false;
		}
		
		
		if(flag==true)
		{
			System.out.println("return true on correct url");
		}
		else
		{
			System.out.println("return false on incorrect url");
		}
		
		
		
		
		

	}

}
