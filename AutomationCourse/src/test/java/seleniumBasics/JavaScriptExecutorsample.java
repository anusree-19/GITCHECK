package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorsample extends Base{
	
	public void javascriptExecutor()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgbox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgbox.sendKeys("hello");
		WebElement showmsg=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor javascript= (JavascriptExecutor)driver; //casting of javascript executor
		javascript.executeScript("arguments[0].click();",showmsg);
		javascript.executeScript("window.scrollBy(0,350)", ""); //scroll down
		javascript.executeScript("window.scrollBy(0,-350)", ""); //scroll up
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaScriptExecutorsample Script= new JavaScriptExecutorsample();
		Script.initializeBrowser();
		Script.javascriptExecutor();
		//javaScript.driverCloseandQuit();

	}

}
