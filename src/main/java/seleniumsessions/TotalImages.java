package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
		
		static WebDriver driver;
	public static void main(String[] args) {
			
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");	
		
		
		List<WebElement> totalImages= driver.findElements(By.tagName("img"));
		
		System.out.println(totalImages.size());
		
		
		for(WebElement e: totalImages)
		{
			String srcValue=e.getAttribute("src");
			System.out.println("src val :  "+  srcValue);
		}
	}

}
