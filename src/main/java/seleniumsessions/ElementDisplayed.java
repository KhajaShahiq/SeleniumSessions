package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();// 123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		boolean isdisplay=driver.findElement(By.className("img-responsive")).isDisplayed();
//		System.out.println(isdisplay);
		
		By element=By.className("img-responsive");
		
		boolean flag=isElementdDisplayed(element);
		System.out.println(flag);
	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static boolean isElementdDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
}
