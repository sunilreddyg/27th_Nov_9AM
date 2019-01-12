package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Invisibilityof_Element_located {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		
		//click radio button roundtrip
		driver.findElement(By.id("RoundTrip")).click();
		
		
		//wait until element invisible
		wait.until(ExpectedConditions.invisibilityOfElementLocated
				(By.id("ReturnDate")));
		System.out.println("element invisible at webpage");
		
		
		
		
		
		
		

	}

}
