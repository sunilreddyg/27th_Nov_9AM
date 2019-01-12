package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args)
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Location at Outlook page
		driver.findElement(By.id("i0116"));
		System.out.println("element identified at outlook page");
		
		//Identify location at facebook page
		driver.findElement(By.id("email"));
		System.out.println("element identified at facebook page");
		
	}

}
