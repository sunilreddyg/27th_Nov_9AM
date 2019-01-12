package collections;

import java.util.ArrayList;
import java.util.List;


public class List_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 * List : Can contain duplicates and elements are ordered. Example
       	 *		implementations are LinkedList (linked list based) and
       	 *   	ArrayList (dynamic array based)
		 */
		
		
		 List<String> list=new ArrayList<String>();
		 list.add("ide");
		 list.add("rc");
		 list.add("wd");
		 list.add("ide");
		 list.add("grid");
		 list.add("agile");

		 /*
		  * Becuase list maintain order we can get any single object
		  * from list using << get >> keyword.
		  * 
		  * 	<<get>> method access single object from list usind
		  * 	index number.
		  */
		 
		 String toolname=list.get(2);
		 System.out.println("Toolname available at 3rd index is => "+toolname);
		 
		 
		 
		 //Iterate scenario using foreach loop
		 for (String tool : list) 
		 {
			System.out.println(tool);
		 }
		 
		 
		 
		 
		 
	
	}

}
