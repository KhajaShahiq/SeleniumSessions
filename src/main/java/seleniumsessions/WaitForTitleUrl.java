package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {
	
		static WebDriver driver;
	public static void main(String[] args) {

		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));	
//		wait.until(ExpectedConditions.titleContains("Your Store"));
//		System.out.println(driver.getTitle());
		
		String title=waitForTitleContains("Your Store", 5);
		System.out.println(title);

	}

		public static String waitForTitleContains(String titlefraction, int timeout)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));	
		
			try {
			if(wait.until(ExpectedConditions.titleContains(titlefraction)))
			{
			return driver.getTitle();	
			}
			}
			catch(Exception e)
			{
				System.out.println("title not found  :" + timeout +"secs");
				
			}
			return null;
		}
		
		public static String waitForTitleIs(String title, int timeout)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));	
		
			try {
			if(wait.until(ExpectedConditions.titleIs(title)))
			{
			return driver.getTitle();	
			}
			}
			catch(Exception e)
			{
				System.out.println("title not found  :" + timeout +"secs");
				
			}
			return null;
		}
	
	
	
}
