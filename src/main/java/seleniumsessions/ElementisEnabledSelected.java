package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementisEnabledSelected {
		static WebDriver driver;
	public static void main(String[] args) {
		//https://classic.freecrm.com/register/
		
		
		driver = new ChromeDriver();// 123
		driver.get("https://classic.freecrm.com/register/");
		
		
		boolean flag=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);
		
		driver.findElement(By.name("agreeTerms")).click();
		
		
		flag=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);
	}

}
