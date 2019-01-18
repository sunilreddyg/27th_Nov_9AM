package pagefactory_Keywords;

import org.openqa.selenium.support.PageFactory;

public class Run_keywords_With_pageobjects 
{

	public static void main(String[] args) 
	{
		
		//Create object for keywords class
		Keywords run=new Keywords();
		run.launch_browser("chrome");
		run.loadApp("http://facebook.com");
		run.setTimeout(30);
		
		
		Facebook_Homepage fbpage=PageFactory.initElements
				(run.driver, Facebook_Homepage.class);
		
		
		run.Enter_textTo_eb(fbpage.editbox_signin_email, "darshan@gmail.com");
		run.Enter_textTo_eb(fbpage.editbox_signin_password, "hello");
		run.Click_element(fbpage.button_login_submit);
		

	}

}
