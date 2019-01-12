package sel.java.Arrays;

public class Static_Array {

	public static void main(String[] args) 
	{
		
		//During Static array we must define boundary level before store values
		int add[]=new int[5];
		add[0]=100;
		add[1]=200;
		add[2]=300;
		add[3]=400;
		add[4]=500;
		
		
		/*
		 * Implement for loop to print array value..
		 * 	for:--> for usefull to iterate expected range values.
		 */
		for (int i = 0; i < add.length; i++)
		{
			System.out.println(add[i]);
		}
		 
		 
		 //Conduct sum between numbers
		 int sum=0;
		 for (int i = 0; i < add.length; i++)
		 {
			 sum=sum+add[i];
		 }
		 System.out.println("Total sum value is => "+sum);
		 
		 
		 
		 
			//Create new line at console
			System.out.println("\n");
		 
		 
		 	/*
			 * implementing foreach loop to iterate values
			 * foreach:==> Foreach usefull to read array next values. 
			 */
		 
		 	for (int i : add) 
		 	{
				System.out.println(i);
			}
		 
		 
		
	}

}
