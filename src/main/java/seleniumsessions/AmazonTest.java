package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		String Browsername="Chrome";
		BrowserUtil brUtil=new BrowserUtil();
		
		
		brUtil.launchBrowser(Browsername);
		brUtil.launchURL("https://www.amazon.in");
		
		String title=brUtil.getPageTitle();
		System.out.println(title);

		if(title.contains("Online Shopping site in India:"))
		{
			
			System.out.println("Title Pass");
		}
		else
		{
			System.out.println("Title Fail");
		}
		
		String URL=brUtil.getPageURL();
		System.out.println(URL);
		
		if(URL.contains("https://www.amazon"))
		{
			System.out.println("Correct URL");
		}
		else
		{
			System.out.println("Incorrect URL");
		}
		
		brUtil.quit();
	}

}