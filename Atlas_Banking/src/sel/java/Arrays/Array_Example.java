package sel.java.Arrays;

public class Array_Example {

	public static void main(String[] args) 
	{
		
		/*
		 * Array:--> Array store set of similar events into single variable.
		 * 			1. Runtime Array
		 * 			2. Static Array
		 */
		
		
		//=============RuntimeArray===========================
		String tools[]={"ide","rc","wd","grid","rpa","testrunner"};
		System.out.println("2nd index value is => "+tools[2]);
		
		//Get length of array
		int len=tools.length;
		System.out.println("Number of values are => "+len);
		
		
		/*
		 * Implement for loop to print array value..
		 * 	for:--> for usefull to iterate expected range values.
		 */
		 for (int i = 0; i < tools.length; i++) 
		 {
			System.out.println("=> "+tools[i]);
		 }
		
		//Create new line at console
		System.out.println("\n");
		
		
		/*
		 * implementing foreach loop to iterate values
		 * foreach:==> Foreach usefull to read array next values. 
		 */
		for (String eachtool : tools) 
		{
			System.out.println("* "+eachtool);
		}
		

	}

}
