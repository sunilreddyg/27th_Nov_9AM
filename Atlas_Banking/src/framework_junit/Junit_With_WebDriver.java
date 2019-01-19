package framework_junit;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Junit_With_WebDriver 
{
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		//Create simple dateformat
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Get system default date
		Date d=new Date();   //import java.util
		//using default format convert system date
		String time=df.format(d);
	
				
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));

	}
	
	
	@Test
	public void tc001()
	{
		//click Signup link
		driver.findElement(By.linkText("Sign Up")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Sign up page verified");
	}
	
	
	@Test
	public void tc002()
	{
		//click Log In link
		driver.findElement(By.linkText("Log In")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		System.out.println("Login page verified");
	}

	@Test
	public void tc003()
	{
		//click Messenger link
		driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger page verified");
	}

	

}
