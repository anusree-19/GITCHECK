package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.NoSuchElementException;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

import org.openqa.selenium.WebElement;

public class WebElementsCommands extends Base {

	public void handlingWebelementsCommands() {
		// WEBELEMENTS COMMANDS
		// sendkeys();
		// click();
		// getText();
		// clear();
		// getTagName();
		// getCssValue();

		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgbox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgbox.sendKeys("hello");
		WebElement showmsg = driver.findElement(By.xpath("//button[@id=\"button-one\"]"));

		// System.out.println(showmsg.isDisplayed());
		System.out.println(showmsg.isEnabled());

		// explicit wait | webdriver is a class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(showmsg));

		// fluent wait | wait is an interface fluent wait is a class
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)) // Maximum
																											// wait time
				.pollingEvery(Duration.ofSeconds(2)) // Polling interval
				.ignoring(NoSuchElementException.class); // Exceptions to ignore
		fluentwait.until(ExpectedConditions.elementToBeClickable(showmsg));

		showmsg.click();
		WebElement yourmsg = driver.findElement(By.xpath("//div[@id=\"message-one\"]"));
		System.out.println(yourmsg.getText());
		msgbox.clear();
		// WebElement entervaluea=driver.findElement(By.id("value-a"));
		// System.out.println(entervaluea.getTagName());
		System.out.println(showmsg.getCssValue("background-color"));

		WebElement entervaluea = driver.findElement(By.id("value-a"));
		entervaluea.sendKeys("20");
		WebElement entervalueb = driver.findElement(By.id("value-b"));
		entervalueb.sendKeys("30");
		WebElement gettotal = driver.findElement(By.id("button-two"));
		gettotal.click();
		WebElement totalmsg = driver.findElement(By.xpath("//div[@id='message-two']"));
		System.out.println(totalmsg.getText());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebElementsCommands elements = new WebElementsCommands();
		elements.initializeBrowser();
		elements.handlingWebelementsCommands();
		// elements.driverCloseandQuit();

	}

}
