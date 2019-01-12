package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Location {

	public static void main(String[] args) {
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//Identify Nifty tab
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		
		//Get Location of Nifty tab
		Point obj_point=Nifty_tab.getLocation();
		
		//Get Elemnet x and y coordinates
		int obj_x=obj_point.getX();
		int obj_y=obj_point.getY();
		
		System.out.println("Object x coordinates are =>"+ obj_x);
		System.out.println("Object y coordinates are =>"+ obj_y);
		
		//verify object visible at webpage using object coordinates.
		if(obj_x > 0)
			System.out.println("object visible at webpage");
		else
			System.out.println("object hidden at webpage");
	}

}
