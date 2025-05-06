package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{

	public void simpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement simplealert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		simplealert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
	
	public void confirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
	
		WebElement confirmalert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmalert.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
	
	public void promptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
	
		WebElement promptalert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptalert.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("anusree");
		alert.accept();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alert=new AlertHandling();
		alert.initializeBrowser();
		//alert.simpleAlert();
		//alert.confirmAlert();
		alert.promptAlert();
		
		//alert.driverCloseandQuit();

	}

}
