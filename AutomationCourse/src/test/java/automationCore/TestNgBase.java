package automationCore;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNgBase {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void initializeBrowser()
	{
		driver=new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	@AfterMethod
	public void driverCloseandQuit()
	{
		//driver.close(); 
		//driver.quit(); 
	}

}
