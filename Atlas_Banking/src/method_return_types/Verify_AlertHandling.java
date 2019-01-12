package method_return_types;

import org.openqa.selenium.By;

public class Verify_AlertHandling {

	public static void main(String[] args) {
		
		//Create object for class
		Repository obj=new Repository();
		String url="https://www.firstnaukri.com/";
		obj.launch_browser(url);
		obj.load_webpage("http://seleniumhq.org");
		obj.set_timeout(30);
		
		
		//click element without enter data
		obj.Click_element(By.cssSelector("input[value='Search']"));
		
		
		//Verify alert presented at webpage
		obj.Close_Alert();
		
		
		

	}

}
