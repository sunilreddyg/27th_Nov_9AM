package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_facebook_Homepage {

	public static void main(String[] args)
	{
		//initiate browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Using pagefactory class identify page-objects
		Facebook_Homepage fbpage=PageFactory.initElements
				(driver, Facebook_Homepage.class);
		
		fbpage.editbox_signin_email.clear();
		fbpage.editbox_signin_email.sendKeys("darshan@gmail.com");
		
		fbpage.editbox_signin_password.clear();
		fbpage.editbox_signin_password.sendKeys("Hello12345");
		
		fbpage.button_login_submit.click();

	}

}
