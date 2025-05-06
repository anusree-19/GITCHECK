package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{

	public void multipleWindowhandle()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentwindowhandleid=driver.getWindowHandle();
		WebElement click = driver.findElement(By.xpath("//a[text()='Click Here']"));
		click.click();
		System.out.println(parentwindowhandleid);
		Set<String> handleids=driver.getWindowHandles();
		System.out.println(handleids);
		
		Iterator<String>values=handleids.iterator(); //iteration
		while (values.hasNext()) {
			String current_id = values.next();
			if(!current_id.equals(parentwindowhandleid))
			{
				driver.switchTo().window(current_id);
				WebElement email_fId=driver.findElement(By.xpath("//input[@name='emailid']"));
				email_fId.sendKeys("anu123@gmail.com");
				WebElement submit_fld= driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit_fld.click();
				driver.switchTo().defaultContent();
			}
		}
		//System.out.println(driver.getCurrentUrl());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleWindowHandling window= new MultipleWindowHandling();
		window.initializeBrowser();
		window.multipleWindowhandle();
		//window.driverCloseandQuit();

	}

}
