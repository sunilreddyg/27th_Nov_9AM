package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		//Enable mouse and keyboard interactions on automation browser
		Actions action=new Actions(driver);
		
		//Identify Link
		WebElement Products=driver.findElement(By.linkText("Products"));
		action.moveToElement(Products).perform();
		Thread.sleep(5000);
		
		//Identify link
		WebElement Demat=driver.findElement(By.linkText("Demat"));
		action.moveToElement(Demat).perform();
		Thread.sleep(5000);
		
		
		//Identify link
		WebElement Demat_act_link=driver.findElement(By.linkText("Demat Account"));
		Demat_act_link.click();
		
		/*
		 * click with mouse actions
		 * action.click(Demat_act_link).click().perform();
		 */
		
		
		
		
		
		
		
		
		

	}

}
