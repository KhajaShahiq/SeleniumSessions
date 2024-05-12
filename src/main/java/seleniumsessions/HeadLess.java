package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess {

	public static void main(String[] args) {

		
		
		
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/");

		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
