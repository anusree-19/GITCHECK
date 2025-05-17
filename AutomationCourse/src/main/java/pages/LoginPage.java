package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	//Actions
	
	//Driver Initialization
	
	public LoginPage(WebDriver driver) //creating constructor
	{
		this.driver=driver; //(reference variable = driver)
		PageFactory.initElements(driver, this); //initialize elements
	}
	
	//PageObjects
	
	@FindBy(id="user-name")private WebElement usernamefield; //encapsulation(use of private)
	@FindBy(id="password")private WebElement passwordfield;
	@FindBy(id="login-button")private WebElement loginbtn;
	
	
	public void enterUsernameonUsernamefield(String username)
	{
		usernamefield.sendKeys(username);
	}
	
	public void enterPwdonPasswordfield(String password)
	{
		passwordfield.sendKeys(password);
	}
	public void clickOnLogin()
	{
		loginbtn.click();
	}
	
}
