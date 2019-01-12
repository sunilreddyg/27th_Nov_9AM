package method_return_types;

import org.openqa.selenium.WebElement;

public class Run_WebTable 
{
  
	public static void main(String args[])
	{
		//Create object for class
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("https://www.bseindia.com/");
		obj.set_timeout(30);
		
		
		WebElement Stockcell=obj.Get_Table_CellAddress("//div[@id='indi']", 2, 1);
		String Name=Stockcell.getText();
		System.out.println(Name);
		
		
		obj.Webtable_Dynamic_CellAdress("//div[@id='indi']", "S&P BSE 100", 0).click();
		
	}
	

}
