package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_GetSize {

	public static void main(String[] args) {
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//Identify Nifty tab
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		
		//Get Element size
		Dimension obj_dim=Nifty_tab.getSize();

		//using object dimension get element height and width
		int obj_height=obj_dim.getHeight();
		int obj_width=obj_dim.getWidth();
		
		
		System.out.println("object height is => "+obj_height);
		System.out.println("object width is => "+obj_width );
		
		//Verify object visibility using size
		if(obj_height > 0)
			System.out.println("object visible at webpage");
		else
			System.out.println("object hidden at webpage");
	}

}
