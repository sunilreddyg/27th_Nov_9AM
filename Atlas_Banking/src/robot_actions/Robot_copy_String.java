package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_copy_String 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
	
		
		//launch Notepad file at runtime.
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		
		
		String text="Selenium automates browsers. "
				+ "That's it! What you do with that power is entirely up to you.";
		
		
		//select String
		StringSelection Stext=new StringSelection(text);
		//Get system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Copy selection to system clipboard
		clipboard.setContents(Stext, Stext);
		
		
		//Create object for Robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//use ctrl+V  
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//Release ctrl
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Use ctrl+S  to save file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		//Release ctrl
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		
		//New String selection
		String path="D:\\sunill\\27th_Nov_9AM\\Atlas_Banking\\src\\robot_actions\\OP.txt";
		StringSelection Spath=new StringSelection(path);
		Clipboard clipboard1=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard1.setContents(Spath, Spath);
		
		
		//use ctrl+V  
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//Release ctrl
		robot.keyRelease(KeyEvent.VK_CONTROL);

		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
