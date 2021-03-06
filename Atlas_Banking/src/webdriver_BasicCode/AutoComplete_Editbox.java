package webdriver_BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//select Radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		
		
		//Identify Editbox and send referal keyword
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Identify Editbox 
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(4000);
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		
		
		//identify Departure date editbox [Calendar editbox is writable]
		driver.findElement(By.id("DepartDate")).clear();
		driver.findElement(By.id("DepartDate")).sendKeys("Wed, 10 Apr, 2019");
		Thread.sleep(3000);
		
		
		//Select date
		driver.findElement(By.linkText("23")).click();
		Thread.sleep(3000);
		
		//Click Next month button at return date calendar
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("23")).click();
		
		
		//click Search button
		driver.findElement(By.id("SearchBtn")).click();
	}

}
