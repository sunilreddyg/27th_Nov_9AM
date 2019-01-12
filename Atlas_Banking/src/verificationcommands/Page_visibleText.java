package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_visibleText {

	public static void main(String[] args) 
	{
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		/*
		 * Without enter data at registration page click on 
		 * signup button
		 */
		WebElement Signup_btn=driver.findElement(By.name("websubmit"));
		Signup_btn.click();
		
		
		//Locate page
		WebElement Page=driver.findElement(By.tagName("body"));
		
		/*
		 * getText method capture selected element and it's
		 * child outter text.
		 */
		String Page_visibleText=Page.getText();
		
		//Verify Expected msg available at webapge
		if(Page_visibleText.contains("What's your name?"))
			System.out.println("expected text visible at webpage");
		else
			System.out.println("text not visible at webpage");
		
	}

}
