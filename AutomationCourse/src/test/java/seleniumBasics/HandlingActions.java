package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	
	public void verifyRightClick()
	{
		WebElement homeicon=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action=new Actions(driver);
		action.contextClick(homeicon).build().perform();
		
	}
	
	public void verifyMouseHover()
	{
		WebElement progressbarmenu=driver.findElement(By.xpath("//a[@id='progress-bars']"));
		Actions action=new Actions(driver);
		action.moveToElement(progressbarmenu).build().perform();
		
	}
	
	public void verifyDragandDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
	
		WebElement dragme=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drophere=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragme, drophere).build().perform();
		WebElement droppedmsg=driver.findElement(By.xpath("//p[text()='Dropped!']"));
		System.out.println(droppedmsg.getText());
		System.out.println(droppedmsg.isDisplayed());
		
	}
	
	public void verifyKeyboardAction() throws AWTException
	{
		// To open new tab (ctrl+T)
		
		Robot robot=new Robot(); //robot class for handling keyboard actions
		robot.keyPress(KeyEvent.VK_CONTROL); // pressing ctrl key . VK:virtual key , keyevent:class
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL); // to release a key 
		robot.keyRelease(KeyEvent.VK_T);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingActions actions= new HandlingActions();
		actions.initializeBrowser();
		//actions.verifyRightClick();
		//actions.verifyMouseHover();
		actions.verifyDragandDrop();
		/*try {
			actions.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//actions.driverCloseandQuit();

	}

}
