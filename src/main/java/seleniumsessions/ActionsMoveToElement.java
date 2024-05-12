package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		//driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		
		//WebElement content = driver.findElement(By.className("menulink"));
		
//		Actions act = new Actions(driver);
//		act.moveToElement(content).perform();
//		//act.moveToElement(content).build().perform();
//		//1 - perform
//		//1 - build.perform
//		//n -- build.perform
//		
//		Thread.sleep(1500);
//		
//		driver.findElement(By.linkText("COURSES")).click();
	
	
		By parent = By.xpath("//div[text()='Add-ons']");
		By subMenu = By.xpath("//div[text()='Visa Services']");
		handleMenuSubMenu(parent, subMenu);
	

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void handleMenuSubMenu(By parentlocator, By sublocator) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentlocator)).perform();
		Thread.sleep(1500);
		getElement(sublocator).click();
	}
	
}
