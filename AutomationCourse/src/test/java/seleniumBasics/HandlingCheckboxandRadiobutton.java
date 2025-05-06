package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckboxandRadiobutton extends Base{
	
	public void handlingCheckboxandRadiobutton() 
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement value1=driver.findElement(By.xpath("	//input[@value='option-1']"));
		value1.click();
		System.out.println(value1.isSelected());
		
	}
	
	public void handlingRadiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement radio=driver.findElement(By.xpath("//input[@value='blue']"));
		radio.click();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingCheckboxandRadiobutton check=new HandlingCheckboxandRadiobutton();
		check.initializeBrowser();
		check.handlingCheckboxandRadiobutton();
		//check.handlingRadiobutton();
		//check.driverCloseandQuit();
	}

}
