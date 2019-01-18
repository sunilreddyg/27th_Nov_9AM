package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Messenger_Hoemepage 
{
	
	@FindBy(id="email")
	WebElement editbox_signin_email;

	@FindBy(id="pass")
	WebElement editbox_signin_password;
	
	@FindBy(id="loginbutton")
	WebElement button_login;

}
