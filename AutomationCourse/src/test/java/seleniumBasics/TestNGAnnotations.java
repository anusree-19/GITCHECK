package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void testcase()
	{
		System.out.println("Testcase");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class");
	}
	@BeforeSuite
	public void beforesuite() 
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
}
