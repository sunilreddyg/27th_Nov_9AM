package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Messenger_login {

	public static void main(String[] args) 
	{
		//initiate browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
				
				
		//Using pagefactory class identify page-objects
		Facebook_Homepage fbpage=PageFactory.initElements
						(driver, Facebook_Homepage.class);
		
		Messenger_Hoemepage Mpage=PageFactory.initElements
				(driver, Messenger_Hoemepage.class);
		
		fbpage.link_Messenger.click();
		Mpage.editbox_signin_email.clear();
		Mpage.editbox_signin_email.sendKeys("9030248885");

	}

}
