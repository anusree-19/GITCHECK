package seleniumBasics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base{
	
	public void handlingTables()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		// to get a entire table data
		WebElement fulltable=driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(fulltable.getText());
		//to select particular row
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tablerow.getText());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HandlingTables table=new  HandlingTables();
		 table.initializeBrowser();
		 table.handlingTables();
		// table.driverCloseandQuit();
				 
		
	}

}
