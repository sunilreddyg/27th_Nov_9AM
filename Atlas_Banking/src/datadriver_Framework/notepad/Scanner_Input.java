package datadriver_Framework.notepad;

import java.util.Scanner;

public class Scanner_Input 
{

	public static void main(String[] args) 
	{
		
		//create object for scanner
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("usenrame is => "+name);
		
		System.out.println("Enter Code");
		int usercode=sc.nextInt();
		System.out.println("user code => "+usercode);
		
		
		
		System.out.println("start iteration");
		int sitr=sc.nextInt();
		System.out.println("end iteration");
		int eitr=sc.nextInt();
		
		for (int i = sitr; i <= eitr; i++) 
		{
			System.out.println(i);
		}
		
		
	}

}
