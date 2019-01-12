package sel.java.Varaibles;

public class VariableTypes 
{
	String url="http://google.com";  //Instant variable
	static double price=1234.23;	//class variable
	public void method1()
	{
		String user="Arjun";   //Local variable
		System.out.println(user);
	}
	public void method2()
	{
		System.out.println("instant variable => "+url);
	}
	public static void main(String[] args)
	{
		//Create object for Class
		VariableTypes obj=new VariableTypes();
		String appurl=obj.url;
		System.out.println("instant variable is=> "+appurl);
		//Note:--> Class variable we can call without object creation
		System.out.println("class variable is => "+price);
	}

}
