package testScript;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNgBase;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNgBase{
	
	@Test
	public void verifyUserCanSucessfullyLoginWithValidCreditionals() throws IOException
	{
		String username=ExcelUtility.readStringData(0, 0,"LoginPage");
		String password=ExcelUtility.readStringData(0, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameonUsernamefield(username);
		loginpage.enterPwdonPasswordfield(password);
		loginpage.clickOnLogin();
		
	}
	@Test
	public void verifyUserCanSucessfullyLoginWithValidUsernameInvalidpwd() throws IOException
	{
		String username=ExcelUtility.readStringData(1, 0,"LoginPage");
		String password=ExcelUtility.readStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameonUsernamefield(username);
		loginpage.enterPwdonPasswordfield(password);
		loginpage.clickOnLogin();
	}
	
	@Test
	public void verifyUserCanSucessfullyLoginWithInvalidUsernameValidpwd() throws IOException
	{
		
		String username=ExcelUtility.readStringData(2, 0,"LoginPage");
		String password=ExcelUtility.readStringData(2, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameonUsernamefield(username);
		loginpage.enterPwdonPasswordfield(password);
		loginpage.clickOnLogin();
	}
	
	@Test
	public void verifyUserCanSucessfullyLoginWithInvalidUsernameInvalidpwd() throws IOException
	{
		String username=ExcelUtility.readStringData(3, 0,"LoginPage");
		String password=ExcelUtility.readStringData(3, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameonUsernamefield(username);
		loginpage.enterPwdonPasswordfield(password);
		loginpage.clickOnLogin();
	}
	
	
	

}
