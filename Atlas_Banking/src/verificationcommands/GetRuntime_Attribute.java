package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Attribute {

	public static void main(String[] args) 
	{
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//click Multicity tab
		WebElement Multicity=driver.findElement(By.xpath("//label[text()='multi-city']"));
		//Multicity.click();
		
		
		//Get Runtime attribute
		String Runtime_class=Multicity.getAttribute("class");
		if(Runtime_class.contains("flight-trip-type"))
		{
			System.out.println("Muticity tab is active");
			
					//Verify Addcity button visible on multicity selection
					WebElement Addcity_btn=driver.findElement(By.id("addModifyBtn"));
					if(Addcity_btn.isDisplayed())
						System.out.println("Add city visible on multicity sleection");
					else
						System.out.println("Add city button not visible on multicity selection");
		}
		else
			System.out.println("multicy tab is not active");
		
		
		
		
		
		
		
		

	}

}
