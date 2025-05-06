package seleniumBasics;

public class Browsercommands extends Base {
	
	public void verifyBrowsercommands()
	{
		String title=driver.getTitle(); // to  get a title
		System.out.println(title);
		String url=driver.getCurrentUrl(); // to get url 
		System.out.println(url);
		String handleid=driver.getWindowHandle();
		System.out.println(handleid);
		String source=driver.getPageSource();
		System.out.println(source);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browsercommands browser=new Browsercommands();
		browser.initializeBrowser();
		browser.verifyBrowsercommands();
		browser.driverCloseandQuit();

	}

}
