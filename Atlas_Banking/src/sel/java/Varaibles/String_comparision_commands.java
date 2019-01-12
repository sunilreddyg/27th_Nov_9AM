package sel.java.Varaibles;

public class String_comparision_commands 
{

	public static void main(String[] args)
	{
		
		/*
		 * String:--> 
		 * 			=> String allow set of characters.
		 * 			=> String is not only a datatype and also called
		 * 				as class.
		 * 			=> String class contains set of validation methods.
		 */
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false;
		 */
		String act_res="Created Successfull";
		String exp_res="created successfull";
		
		boolean flag=act_res.equals(exp_res);
		System.out.println("Equal comparision is => "+flag);
		
		/*
		 * EqualIgnorecase:-->
		 * 		Method verify equal comparision between two strings
		 * 		by ignoring casesensitive. and return true/false.
		 */
		boolean flag1=act_res.equalsIgnoreCase(exp_res);
		System.out.println("Ignorecase comparision is => "+flag1);
		
		
		/*
		 * contains:-->
		 * 		method verify sub String availability at main String
		 */
		String result="user 100 register successfull";
		boolean flag2=result.contains("100");
		System.out.println("sub String available status  "+flag2);
		
		
		/*
		 * subString:-->
		 * 		Method get sub String from main String
		 */
		String Account_number="1245784512457845";
		String crn=Account_number.substring(12);
		System.out.println("last 4 digit number is => "+crn);
		
		
		/*
		 * length:-->
		 * 		method return length of characters availabel at stirng
		 */
		int len=Account_number.length();
		System.out.println("Account number length is => "+len);
		
		
		/*
		 * trim:--> 
		 * 		Method trim extra spaces
		 */
		String mobile="     9030248855  ";
		System.out.println("length before trim is => "+mobile.length());
		
		String New_mobile=mobile.trim();
		System.out.println("Mobile number after trim is => "+New_mobile.length());
	}

}
