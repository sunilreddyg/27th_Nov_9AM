package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_DataFrom_Specific_Row_And_Cell {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		
		//Identify table
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//identify dynamic rows available under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Select 6th row
		WebElement SelectedRow=rows.get(7);
		
		//Get count of dynamic cells
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Get zero cell and 3rd cell data
		String CompanyName=cells.get(0).getText();
		String Highprice=cells.get(3).getText();
		
		System.out.println(CompanyName+"    "+Highprice);
	}

}
