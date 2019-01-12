package method_parameters;

import org.openqa.selenium.By;

public class Run_Repository {

	public static void main(String[] args) 
	{
		//Create object for repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		
		//Enter text into editbox using xpath
		obj.Enter_text("//input[@id='email']", "Darshan");
		obj.Enter_text("//input[@id='pass']", "Hello");
		
		
		
		//enter text into editbox using locator class
		obj.Enter_text(By.name("firstname"), "Newuser");
		obj.Enter_text(By.cssSelector("#u_0_l"), "Newuser");
		
		
		//Select dropdown option
		obj.Select_dropdown(By.id("day"), "12");
		obj.Select_dropdown(By.id("month"), "May");
		obj.Select_dropdown(By.id("year"), "1990");
		
		
		
		
		
	}

}
