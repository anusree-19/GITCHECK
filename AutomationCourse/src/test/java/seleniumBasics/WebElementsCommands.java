package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;

public class WebElementsCommands extends Base {
	
	public void handlingWebelementsCommands()
	{
		//WEBELEMENTS COMMANDS
			//sendkeys();
			//click();
			//getText();
			//clear();
			//getTagName();
			//getCssValue();
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgbox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgbox.sendKeys("hello");
		WebElement showmsg=driver.findElement(By.xpath("//button[@id=\"button-one\"]"));
		
		//System.out.println(showmsg.isDisplayed());
		System.out.println(showmsg.isEnabled());
		
		showmsg.click();
		WebElement yourmsg=driver.findElement(By.xpath("//div[@id=\"message-one\"]"));
		System.out.println(yourmsg.getText());
		msgbox.clear();
		//WebElement entervaluea=driver.findElement(By.id("value-a"));
		//System.out.println(entervaluea.getTagName());
		System.out.println(showmsg.getCssValue("background-color"));
		
		WebElement entervaluea=driver.findElement(By.id("value-a"));
		entervaluea.sendKeys("20");
		WebElement entervalueb=driver.findElement(By.id("value-b"));
		entervalueb.sendKeys("30");
		WebElement gettotal=driver.findElement(By.id("button-two"));
		gettotal.click();
		WebElement totalmsg= driver.findElement(By.xpath("//div[@id='message-two']"));
		System.out.println(totalmsg.getText());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElementsCommands elements=new WebElementsCommands();
		elements.initializeBrowser();
		elements.handlingWebelementsCommands();
		//elements.driverCloseandQuit();
		
	}

}
