package method_return_types;

public class Run_Repository {

	public static void main(String[] args) 
	{
		//Create object for class
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://seleniumhq.org");
		obj.set_timeout(30);
		
		
		String Exp_title="Selenium - Web Browser Automation";
		if(obj.IsTitlePresented(Exp_title))
			System.out.println("title verified");
		else
			System.out.println("title not verified");
		
		
		String Exp_url="https://www.seleniumhq.org/";
		if(obj.isurl_Presented(Exp_url))
			System.out.println("url verified");
		else
			System.out.println("url not verified");
		
		
		String Exp_text="What is Selenium?";
		if(obj.is_textVisible_Atpage(Exp_text))
			System.out.println("text verified");
		else
			System.out.println("text not verified");
		
		
		
	}

}
