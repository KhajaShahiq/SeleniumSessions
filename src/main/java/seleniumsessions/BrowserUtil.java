package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	WebDriver driver;

	/**
	 * This is to Launch Browser
	 * @param browserName
	 * @return
	 */
	public WebDriver launchBrowser(String browserName)
	{
		System.out.println("Browser is  :  " + browserName);
		
		switch(browserName.toLowerCase().trim())
		{
		case "chrome" :
		System.out.println("Chrome browser launched");
		driver=new ChromeDriver();
		break;
		
		case "firefox" :
		System.out.println("Firefox browser launched");
		driver=new FirefoxDriver();
		break;
		
		case "edge" :
		System.out.println("Edge browser launched");
		driver=new EdgeDriver();
		break;
			
		default :
			System.out.println("pass right browser"  +browserName);
			throw new BrowserException("browser not found");
			
		}	
		return driver;	
		
	}
		public void launchURL(String url)
		{
			
		if(url == null)
		{
			throw new BrowserException("No url entered");
		}
		if(url.indexOf("http")==0)
		{
			driver.get(url);
		}
		else
		{
			throw new BrowserException("No http Entered");

		}
		
		}
		public String getPageTitle()
		{
			return driver.getTitle();
		}

		
		
		public String getPageURL()
		{
			return driver.getCurrentUrl();
		}
		
		public void close()
		{
			driver.close();
		}
		
		
		public void quit() {
			driver.quit();
		}
		
		
		
}
