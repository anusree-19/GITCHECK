package SeleniumBasics;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;

public class HandlingLocators extends Base {

	public void handlinglocators()
	{
		driver.findElement(By.id("button-one")); // unique
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));
		
		//css selctor= tagname[attribute=’value’]
		
		driver.findElement(By.cssSelector("button[id='button-one']")); 
		
		 // XPath = //tagname[@attribute=’value’]
		
		driver.findElement(By.xpath("//button[@id='button-one']")); 
		driver.findElement(By.xpath("//button[@id='button-two']")); 
		
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.id("value-a"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.linkText("Checkbox Demo"));
		driver.findElement(By.partialLinkText("Radio Buttons"));
		driver.findElement(By.cssSelector("button[id='button-two']"));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.xpath("//input[@id='value-a']"));
		driver.findElement(By.xpath("//input[@id='value-b']"));
		driver.findElement(By.xpath("//input[@id='single-input-field']")); 
		
		driver.findElement(By.xpath("//div[@id=\"message-two\"]")); // using attribute
		
		driver.findElement(By.xpath("//label[text()='Enter Message']")); // using text() method
		
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]")); // using starts-with 
		
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']")); //using AND operator
		
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']")); // OR operator
		
		// xpath axis methods :
		
		// SYNTAX of axis method : //tagname[@attribute=’value’]//axesMethodName::tagname
		
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']")); 
		 //parent 
		
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']")); //child
		
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']")); //following
		
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']")); //preceding
	
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div")); //ancestor (parent of parent)
		
		driver.findElement(By.xpath("//div[@class='card']//descendant::div")); // descendant (child and grand children)
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingLocators locator=new HandlingLocators();
		locator.initializeBrowser();
		locator.handlinglocators();
		locator.driverCloseandQuit();

		

	}

}
