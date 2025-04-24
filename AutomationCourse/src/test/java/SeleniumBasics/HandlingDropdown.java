package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {

	//Dropdown 
		// by using Select class
		// methods : selectByIndex(2);
				//   selectByVisibleText("C#");
				//   select.selectByValue("sql");
				
	public void handlingDropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement javadropdown=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		//javadropdown.click();
		Select select=new Select(javadropdown);
		//select.selectByIndex(2);
		//select.selectByVisibleText("C#");
		select.selectByValue("sql");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingDropdown dropdown=new HandlingDropdown();
		dropdown.initializeBrowser();
		dropdown.handlingDropdown();
		//dropdown.driverCloseandQuit();
		

	}

}
