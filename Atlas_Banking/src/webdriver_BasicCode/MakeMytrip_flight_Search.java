package webdriver_BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytrip_flight_Search {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Identify Editbox
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("HYD");
		Thread.sleep(3000);
		
		
		driver.findElement(By.className("autoCompleteItem__label")).click();
		Thread.sleep(2000);
		
		
		//IDentify Editbox
		driver.findElement(By.id("hp-widget__sTo")).clear();
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("MAA");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Chennai, India']")).click();
		
		//Select departure date
		driver.findElement(By.linkText("27")).click();
		
		//click search button
		driver.findElement(By.id("searchBtn")).click();
		
		
	}

}
