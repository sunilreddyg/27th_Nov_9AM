package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Title {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.org");
		driver.manage().window().maximize();
		
		
		//Capture runtime title
		String Runtime_title=driver.getTitle();
		System.out.println("Current window title is => "+Runtime_title);
		
		
		//Store Expected title into variable
		String Exp_title="Selenium - Web Browser Automation";
		
		
		//Verify equal comparision between two strings
		boolean flag=Runtime_title.equals(Exp_title);
		System.out.println("SeleniumHQ page status is => "+flag);
		
		
		//use precondition to continue scripting on title verified
		if(flag==true)
		{	
			System.out.println("Homepage title verified");
			//click Projects link
			WebElement projects=driver.findElement(By.linkText("Projects"));
			projects.click();
			
			//Verify project paget tile status
			if(driver.getTitle().equals("Selenium Projects"))
				System.out.println("projects page title veriied");
			else
				System.out.println("projects page title mismatch");
		}
		else
		{
			System.out.println("page title mismatch");
		}
		
		
		
	}

}
