package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		//select Radio button
		driver.findElement(By.id("RoundTrip")).click();
		

		//Identify Editbox and send referal keyword
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("DEL");
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Identify Editbox 
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("HYD");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		
		
		//identify Departure date editbox [Calendar editbox is writable]
		driver.findElement(By.id("DepartDate")).clear();
		driver.findElement(By.id("DepartDate")).sendKeys("Wed, 10 Apr, 2019");
		
		
	
		//Select date
		driver.findElement(By.linkText("22")).click();
		
		
		//Click Next month button at return date calendar
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("12")).click();
		
		
		//click Search button
		driver.findElement(By.id("SearchBtn")).click();
	}

}
