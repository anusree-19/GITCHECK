package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileupload extends Base{

	public void fileuploadusingSendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload");
		
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\Anusree\\git\\GITCHECK\\AutomationCourse\\src\\test\\resources\\Selenium_notes.pdf");
	
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='terms']"));
		checkbox.click();
		
		WebElement submitfile=driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitfile.click();
	}
	
	public void fileuploadusingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		
		WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectpdf.click();
		StringSelection s=new StringSelection("C:\\Users\\Anusree\\git\\GITCHECK\\AutomationCourse\\src\\test\\resources\\Selenium_notes.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot robot=new Robot();
		robot.delay(2000); // Wait for the file upload dialog to appear
		  
		  robot.keyPress(KeyEvent.VK_ENTER); //press enter key
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);  
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.keyPress(KeyEvent.VK_ENTER); 
	      robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileupload fileupload=new HandlingFileupload();
		fileupload.initializeBrowser();
		//fileupload.fileuploadusingSendkeys();
		try {
			fileupload.fileuploadusingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fileupload.driverCloseandQuit();

	}

}
