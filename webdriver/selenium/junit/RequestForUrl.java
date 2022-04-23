package webdriver.selenium.junit;

public class RequestForUrl {
	public static void requestForUrl(String Url)
    {
		WebDriverClass.getDriver().navigate().to(Url);
		System.out.println("Navigation Class" +WebDriverClass.getDriver().getTitle());
    }
}
