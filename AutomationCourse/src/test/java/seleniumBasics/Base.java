package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	//to initialize a WebDriver. WebDriver is an interface. driver is a reference of WebDriver. interface cannot create an object
	
	public WebDriver driver;
	//instance method creation
	public void initializeBrowser()
	{
		driver=new ChromeDriver(); // object creation of Chrome webdriver.
		driver.get("https://selenium.qabible.in/");//launch a browser
		driver.manage().window().maximize(); //maximize the window
	}
	public void driverCloseandQuit()
	{
		//driver.close(); //close the single window
		driver.quit(); //closes the multiple browsers or windows.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Base base=new Base();
	base.initializeBrowser();
	base.driverCloseandQuit();

	}

}
