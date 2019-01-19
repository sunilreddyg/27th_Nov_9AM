package framework_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_Aftermethod {

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("pre-condition method");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("post-condition method");
		//Creae new line at console
		System.out.println("\n");
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


	@Test
	public void tc004()
	{
		System.out.println("tc004 executed");
	}
}
