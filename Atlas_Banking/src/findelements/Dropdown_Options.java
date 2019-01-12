package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Options {

	public static void main(String[] args) throws Exception 
	{
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		//Select Dropdown
		WebElement Open_account=driver.findElement(By.id("open_account"));
		//Use New Selector to get single option
		new Select(Open_account).selectByVisibleText("Corporate Account");
				
		//Target Webelement
		WebElement Open_my_account_btn=driver.findElement(By.xpath("//input[@value='Open my Account']"));
		Open_my_account_btn.click();
		Thread.sleep(5000);
		
		
		//Target City Dropdown
		WebElement City_Dropdown=driver.findElement(By.id("FML_USR_ADDRSS_CTY_DROP"));
		
		//Find list of options under city dropdown
		List<WebElement> Dropdown_options=City_Dropdown.findElements(By.tagName("option"));
		
		//Get size of list
		int Dcount=Dropdown_options.size();
		
		
		//Iterate for number of dropdown options
		for (int i = 0; i < Dcount; i++)
		{
			//Get Each option from Dropdown
			WebElement Eachoption=Dropdown_options.get(i);
			//get text of each option
			String Cityname=Eachoption.getText();
			//click City Option
			Eachoption.click();
			Thread.sleep(1000);
			
			
			//Identify state element
			WebElement State_editbox=driver.findElement(By.id("FML_USR_ADDRSS_STTE_DIS"));
			//capture input from state editbox..
			String StateName=State_editbox.getAttribute("value");
			
			
			System.out.println(Cityname.trim()+"    "+StateName);
			
			//Accept condition only when state not displayed at editbox
			if(StateName.isEmpty())
				System.out.println(Cityname.trim()+" => Statename not displayed for this city");
			
		}
		
		
		
	}

}
