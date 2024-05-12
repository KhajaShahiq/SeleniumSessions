package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	 static WebDriver driver;
	
	public static void main(String[] args) {

		//1 
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//driver.findElement(By.id("input-email")).sendKeys("khaja@abc.com");
		//driver.findElement(By.id("input-password")).sendKeys("Khaja123");
		
		//2nd
//		WebElement username=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		username.sendKeys("khaja@abc.com");
//		password.sendKeys("Khaja123");
		
		
		//3rd
		
//		By username=By.id("input-email");
//		By password=By.id("input-password");
//
//		WebElement user=driver.findElement(username);
//		WebElement pass=driver.findElement(password);
//		user.sendKeys("khaja@abc.com");
//		pass.sendKeys("Khaja@123");
		
		//4th	
//		
//		By username=By.id("input-email");
//		By password=By.id("input-password");
//		WebElement email= getElement(username);
//		WebElement pass= getElement(password);
//		
//		email.sendKeys("khaja@abc.com");
//		pass.sendKeys("Khaja123");

		//5th
		
//		By username=By.id("input-email");
//		By password=By.id("input-password");
//		
//		doSendKeys(username, "Khaja@abc.com");
//		doSendKeys(password, "Khaja@123");
		
		
		
		//6th ElementUtil
		
		By username=By.id("input-email");
		By password=By.id("input-password");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(username, "Khaja@abc.com");
		eleUtil.doSendKeys(password, "khaja@123");
		
		
		
	}

	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);	
		
	}
	
	
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	
	
}
