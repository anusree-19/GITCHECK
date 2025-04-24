package SeleniumBasics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base{
	
	public void handlingTables()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		
		//table[@id='dataTable']
		WebElement fulltable=driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(fulltable.getText());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HandlingTables table=new  HandlingTables();
		 table.initializeBrowser();
		 table.handlingTables();
		// table.driverCloseandQuit();
				 
		
	}

}
