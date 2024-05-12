package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) {

		BrowserUtil brUtil=new BrowserUtil();
		
		WebDriver driver=brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title=brUtil.getPageTitle();
		System.out.println(title);
		if(title.equals("Account Login"))
		{
			
			System.out.println("correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		
		
		By username=By.id("input-email");
		By password=By.id("input-password");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(username, "Khaja@abc.com");
		eleUtil.doSendKeys(password, "khaja@123");

		
		brUtil.close();
	}

}
