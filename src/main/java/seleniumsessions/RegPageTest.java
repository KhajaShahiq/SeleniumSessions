package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static String getRandomEmail()
	{
		return "automation"+ System.currentTimeMillis()+"@"+"opencat.com";
	}
	
	public static void main(String[] args) {
	
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fname=By.id("input-firstname");
		By lname=By.id("input-lastname");
		By email=By.name("email");
		By mob = By.id("input-telephone");
		By pwd = By.id("input-password");
		By pwdConfrm = By.id("input-confirm");

		By isSubscribeYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		//By isSubscribeNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");

		By policyChkBox = By.name("agree");
		By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");

		By successMessg = By.tagName("h1");
	
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.doSendKeys(fname, "Shajreen");
		eleutil.doSendKeys(lname,"shaikh");
		eleutil.doSendKeys(email, getRandomEmail());
		eleutil.doSendKeys(mob, "6212856831");
		eleutil.doSendKeys(pwd, "Password1");
		eleutil.doSendKeys(pwdConfrm, "Password1");
		eleutil.doClick(isSubscribeYes);
		eleutil.doClick(policyChkBox);
		eleutil.doClick(continueBtn);
		
		String actSuccMessg = eleutil.doGetElementText(successMessg);
		System.out.println(actSuccMessg);
		if (actSuccMessg.equals("Your Account Has Been Created!")) {
			System.out.println("user Reg -- PASSED");
		} else {
			System.out.println("user Reg -- FAILED");
		}
		
		brUtil.getPageURL();
		
		
		
	}


}