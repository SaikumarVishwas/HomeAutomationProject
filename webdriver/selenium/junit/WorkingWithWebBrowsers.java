package webdriver.selenium.junit;

public class WorkingWithWebBrowsers {
	public static void BrowserMaximize()
    {
        WebDriverClass.getDriver().manage().window().maximize();
   
    }
    public static void GoBack()
    {
        WebDriverClass.getDriver().navigate().back();

    }
    public static void Forward()
    {
        WebDriverClass.getDriver().navigate().forward();
    }
    public static void RefreshPage()
    {
        WebDriverClass.getDriver().navigate().refresh();
    }
}
