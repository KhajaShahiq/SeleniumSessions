package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {


		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title=driver.getTitle();		
		System.out.println(title);
		
		
		if(title.equals("Register Account"))
		{
			System.out.println("title pass" +title);
		}
		else
		{
			System.out.println("title fail");
		}
		
		driver.close();
	}

}
