package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {

	public static void main(String[] args)
	{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Your Store"))
		{
			System.out.println("title pass" );
		}
		else
		{
			System.out.println("title fail" );
		}
		driver.close();
	}

}
