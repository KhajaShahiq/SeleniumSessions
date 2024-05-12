package seleniumsessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();

			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			
			Actions scroll=new Actions(driver);
			scroll.sendKeys(Keys.END).perform();	
			Thread.sleep(3000);
			scroll.sendKeys(Keys.HOME).perform();
			
	}

}
