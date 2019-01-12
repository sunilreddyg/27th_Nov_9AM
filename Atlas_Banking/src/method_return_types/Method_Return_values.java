package method_return_types;

public class Method_Return_values 
{
	
	public void method1()
	{
		//void method it doesn't return any value.
	}
	
	
	public String method2()
	{
		return "WebDriver";
	}
	
	/*
	 * =>Otherthan void we must write return keyword.
	 * =>return value should match with method type.
	 * =>It return value to methodname
	 */
	

	public static void main(String[] args) 
	{
		
		//Create object for class
		Method_Return_values obj=new Method_Return_values();
		
		//Calling void method
		obj.method1();
		
		//calling String return method
		String name=obj.method2();
		System.out.println("return value is => "+name);

	}

}
