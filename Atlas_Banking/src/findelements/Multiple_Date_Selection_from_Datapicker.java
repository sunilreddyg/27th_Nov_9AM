package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Date_Selection_from_Datapicker {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//Identify Departure date
		WebElement Departuredate=driver.findElement(By.id("dpt_date"));
		Departuredate.click();
		Thread.sleep(1000);
		
		
		
		//Iterate for expected range
		for (int i = 0; i < 3; i++) 
		{
			
			
			//Identify Current month table
			WebElement Current_month;
			Current_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Find all clickable link
			List<WebElement> clickable_links;
			clickable_links=Current_month.findElements(By.tagName("a"));
			
			//Iterate for list of links
			for (int j = 0; j < clickable_links.size(); j++) 
			{
				//Target Each link
				WebElement EachDate=clickable_links.get(j);
				EachDate.click();
				Thread.sleep(1000);
				
				//Open datepicker
				driver.findElement(By.id("dpt_date")).click();
				Thread.sleep(1000);
				
				//Restore all links
				Current_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
				clickable_links=Current_month.findElements(By.tagName("a"));
			}
			
			
			//IDentify Next month button
			WebElement Next_month_btn=driver.findElement(By.id("cal_showNextMonth"));
			Next_month_btn.click();
			Thread.sleep(2000);
			
		}
	}

}
