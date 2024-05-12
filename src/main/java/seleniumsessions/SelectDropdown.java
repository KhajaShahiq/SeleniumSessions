package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		
		driver = new ChromeDriver();// 123
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		
//		WebElement country=driver.findElement(By.id("Form_getForm_Country"));
//		Select ele=new Select(country);
//		
//		ele.selectByIndex(3);
//		ele.selectByVisibleText("Australia");
//		ele.selectByValue("India");
		
		By country=By.id("Form_getForm_Country");
		
		doSelectByIndex(country, 5);
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

//	public static void doSelectByVisibleText(By locator, String visibleText) {
//		if (visibleText == null || visibleText.length() == 0) {
//			throw new MyElementException("visible text can not be null");
//		}
//
//		Select select = new Select(getElement(locator));
//		select.selectByVisibleText(visibleText);
//	}
//
//	public static void doSelectByValue(By locator, String value) {
//
//		if (value == null || value.length() == 0) {
//			throw new MyElementException("visible text can not be null");
//		}
//
//		Select select = new Select(getElement(locator));
//		select.selectByValue(value);
//	}

	
	
}
