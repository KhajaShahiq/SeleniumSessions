package seleniumsessions;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtils {

	
	static WebDriver driver;
	public static void main(String[] args) {
			
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By links= By.xpath("//a[@class='list-group-item']");
		By images=By.tagName("img");
		
		//System.out.println(getElements(links));
		System.out.println(getElementsCount(links));

		System.out.println(getElementsCount(images));
	
		ArrayList<String> eleTexts = getElementsTextList(links);
		System.out.println(eleTexts);
		
		
		
//
//		ArrayList<String> eleAltValues = getElementAttributeList(images, "alt");
//
//		System.out.println(eleAltValues);
//		
	}	
		
	
	
	
	
	public static List<WebElement> getElements(By Locator)
	{
		return driver.findElements(Locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();// pc=0

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}

		return eleTextList;
	}
	
	public static ArrayList<String> getElementAttributeList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAttrList = new ArrayList<String>();// pc=0

		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			
			if (attrValue.length() != 0) {
				eleAttrList.add(attrValue);
			}
		}

		return eleAttrList;
	}
	
}
