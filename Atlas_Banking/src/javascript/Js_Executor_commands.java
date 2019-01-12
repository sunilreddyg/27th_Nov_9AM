package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_commands {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * when to use javascript executor:----->
		 * 
		 * 
		 * Because of cross domain policies browsers enforce your 
		 * script execution may fail unexpectedly and without 
		 * adequate error messaging. mostly happend when trying to access 
		 * another frame. 
		 * 
		 * Note:--> 
		 *  Most times when troubleshooting failure it's 
		 *  best to view the browser's console after 
		 *  executing the WebDriver request.
		 *  
		 *  
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("write java script");
		
		//Type text into editbox using javascript
		js.executeScript("document.getElementById('u_0_j').value='Arjun'");
		js.executeScript("document.getElementById('u_0_l').value='Newuser'");
		js.executeScript("document.getElementById('u_0_o').value='samnewuser@gmail.com'");
		js.executeScript("document.getElementById('u_0_r').value='samnewuser@gmail.com'");
		js.executeScript("document.getElementById('u_0_v').value='Sam1234'");
		
		
		//Identify Dropdown 
		WebElement Day_dropdown=driver.findElement(By.xpath("//select[@id='day']"));
		//Use javascript to select dropdown
		js.executeScript("arguments[0].value='15'",Day_dropdown);
		
		
		//Identify Dropdown 
		WebElement month_dropdown=driver.findElement(By.xpath("//select[@id='month']"));
		//Use javascript to select dropdown using xpath
		js.executeScript("arguments[0].value='May'",month_dropdown);
				
		//Select Dropdown year using ID
		js.executeScript("document.getElementById('year').value='1990'");
		
		
		//select radio button
		WebElement Female_radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
		js.executeScript("arguments[0].click()",Female_radio_btn);
		Thread.sleep(4000);
		
		//select radio button
		WebElement male_radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
		js.executeScript("arguments[0].checked=true",male_radio_btn);
		
		
	}
}
