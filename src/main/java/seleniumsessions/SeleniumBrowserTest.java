package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		String str=driver.getTitle();
		System.out.println(str);
		
		if(str.equals("Google"))
		{
			System.out.println("title pass");
		}
		else
		{
			System.out.println("title fail");
		}
		String Currenturl=driver.getCurrentUrl();
	System.out.println(Currenturl);
	
		driver.close();
	
	
	}
	

}
