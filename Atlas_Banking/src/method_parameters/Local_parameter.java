package method_parameters;

public class Local_parameter 
{
	//method without parameter
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println(name);
	}
	
	//method with local parameter
	public void print_tool(String tooname)
	{
		String name=tooname;
		System.out.println(name);
	}
	
	//method with multiple parameters
	public void print_tool(String tooname, double price)
	{
		String name=tooname;
		System.out.println(name+"  price is => "+price);
	}
	
	
	public static void main(String[] args) 
	{
		
		//Create object for class
		Local_parameter obj=new Local_parameter();
		obj.print_tool();
		
		//calling method with argument
		obj.print_tool("RemoteControl");
		obj.print_tool("IDE");
		obj.print_tool("GRID");
		
		
		//calling method with multiple parameters
		obj.print_tool("Java", 2000.00);
		
	}

}
