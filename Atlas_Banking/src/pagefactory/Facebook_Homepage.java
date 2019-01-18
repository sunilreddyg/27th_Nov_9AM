package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Facebook_Homepage 
{
	
	@FindBy(how=How.ID,using="email")
	WebElement editbox_signin_email;
	
	@FindBy(id="pass")
	WebElement editbox_signin_password;
	
	@FindBy(how=How.XPATH,using="//label[@id='loginbutton']")
	WebElement button_login_submit;
	
	@FindBy(how=How.LINK_TEXT,using="Forgotten account?")
	WebElement link_forgotten_Account;
	
	@FindBy(how=How.TAG_NAME,using="select")
	List<WebElement> dropdowns;

	@FindBy(how=How.ID,using="u_0_j")
	WebElement editbox_signup_firstname;
	
	@FindBy(how=How.LINK_TEXT,using="Messenger")
	WebElement link_Messenger;
	
}
