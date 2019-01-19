package framework_junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("pre-condition class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("post-condition class");
	}

	@Test
	public void tc001()
	{
		System.out.println("tc001 executed");
	}
	
	@Test
	public void tc002()
	{
		System.out.println("tc002 executed");
	}
	
	@Test
	public void tc003()
	{
		System.out.println("tc003 executed");
	}

}
