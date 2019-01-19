package framework_testng.Keywords;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Run_keyWords_From_Repository extends Repository
{
	
	
	@Test
	public void user_login()
	{
		Enter_text(By.id("email"), "darshan@gmail.com");
		Enter_text(By.id("pass"), "hello");
		Capturescreen("LoginPage");
		
	}
	
	
	@BeforeClass
	public void Setup_before()
	{
		launch_browser("chrome");
		load_webpage("http://facebook.com");
	}
	
	
	@AfterClass
	public void Close_browser() throws Exception
	{
		Thread.sleep(4000);
		driver.close();
	}

}
