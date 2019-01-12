package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Identify_Next_records {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		//click link to get webtable
		driver.findElement(By.linkText("Nifty Weightage")).click();
		Thread.sleep(5000);
		
		
		//Identify table
		WebElement table=driver.findElement(By.id("gridSource"));
		
		//Get list of rows available in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		int icount=0;
		//Iterate for dynamic rows
		for (int i = 0; i < rows.size(); i++) 
		{
			
			//Target Each Dynamic Row
			String rowtext=rows.get(i).getText();
			System.out.println(rowtext);
			
			
			if(icount==20)
			{
				WebElement Next_btn=driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[1]/div[2]/div/div/div/form/div[4]/form/div[3]/div/div/div/table/tfoot/tr/th[3]"));
				Next_btn.click();
				icount=0;
			}
			
			icount=icount+1;
			
		}
		
		
		
		

	}

}
