package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public void handlingframes()
	{
		driver.navigate().to("https://demoqa.com/frames");
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		driver.switchTo().frame(frame1);
		WebElement heading= driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		driver.switchTo().defaultContent();
	//frame count
		List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
		int totalframes=iframe.size();
		System.out.println(totalframes);
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingFrames frame= new HandlingFrames();
		frame.initializeBrowser();
		frame.handlingframes();
		//frame.driverCloseandQuit();
		
		

	}

}
