package verificationcommands;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.modifier.SynchronizationState;

public class Verify_Current_SystemDate_At_Application {

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario:--> verify System date match with departure date
		 * 
		 * 			Given http://makemytrip.com
		 * 			when verify Deparute date match with system date.
		 * 			then system should display date as expected
		 */
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		//Capture Data from Departure editbox
		WebElement Departure_editbox=driver.findElement(By.id("hp-widget__depart"));
		//Get Inputvalue from Editbox [typed or autogenarated]
		String Ddate=Departure_editbox.getAttribute("value");
		System.out.println(Ddate);
		
		
		//Create simple date format
		SimpleDateFormat df=new SimpleDateFormat("dd MMM, EEE");
		//Get system current date
		Date d=new Date();
		//using dateformatter convert system current date
		String Sdate=df.format(d);
		
		
		//Verify departue date adn system date
		if(Ddate.equals(Sdate))
			System.out.println("match found");
		else
			System.out.println("date mismatch");
		
		
		/*
		 * java supporting time formatters
		 * 		URL:-->  https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		 */
		
	}

}
