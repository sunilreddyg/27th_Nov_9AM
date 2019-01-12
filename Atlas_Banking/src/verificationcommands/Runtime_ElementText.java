package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_ElementText {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Testcase:--> Verify flight invalid search.
		 * Steps:-->
		 * 			Launch browser and load cleartrip webpage
		 * 			leave madatory fields and click on flight search button
		 * Expected:-->
		 * 			System should display "Error Msg"
		 */
		
		
		
		
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Identify Flight search button
		WebElement Search_btn=driver.findElement(By.id("SearchBtn"));
		Search_btn.click();
		Thread.sleep(5000);
		
		//Locate error text
		WebElement Error_text=driver.findElement(By.id("homeErrorMessage"));
		String Runtime_Text=Error_text.getText();
		System.out.println(Runtime_Text);
		
		//Store expected msg
		String Exp_msg="Sorry, but we can't continue until "
				+ "you fix everything that's marked in RED";
		
		
		if(Runtime_Text.equals(Exp_msg))
			System.out.println("Expected Error msg displayd");
		else
			System.out.println("Expected error msg not displayed");
		

	}

}
