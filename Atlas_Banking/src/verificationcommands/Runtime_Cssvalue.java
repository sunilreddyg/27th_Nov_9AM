package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Cssvalue {

	public static void main(String[] args) throws Exception
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		//Identify Nifty tab
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		//Get Runtime Bg-color of element
		String Runtime_bg_color=Nifty_tab.getCssValue("background-color");
		System.out.println(Runtime_bg_color);
		
		String exp_color="rgba(231, 120, 23, 1)";
		
		//Verify expected and actual color
		if(Runtime_bg_color.equals(exp_color))
			System.out.println("Expected color displayed");
		else
			System.out.println("color mismatch");
	}

}
