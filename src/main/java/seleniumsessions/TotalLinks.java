package seleniumsessions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links :  " + ele.size());
		
		for(int i=0;i<ele.size();i++)
		{
			
			String text=ele.get(i).getText();
			if(text.length()!=0)
			{
			System.out.println(text);
			}
		}
		
		System.out.println(" --------------");
		
		for(WebElement e: ele)
		{
			String txt=e.getText();
			if(txt.length()!=0)
			{
			System.out.println(txt);
			}
		}
	
		System.out.println(" --------------");
		
		List<WebElement> alltxtfields=driver.findElements(By.className("form-control"));
		System.out.println(alltxtfields.size());
		
		for(WebElement i: alltxtfields)
		{
			i.sendKeys("Test");
			//System.out.println(fields);
		}
		
	}

}
