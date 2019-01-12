package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_WIndowHandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Get Runtime Dynamic Window ID
		String Window_dynamicID=driver.getWindowHandle();
		System.out.println(Window_dynamicID);
	}

}
