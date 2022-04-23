package webdriver.selenium.junit;

import org.junit.Test;
import org.openqa.selenium.By;

public class HowToTestNavigationOfWebPages {
	
	@Test
	public void t2() {
		RequestForUrl.requestForUrl("http://google.com");
	    WorkingWithWebButtons.ClickButton(By.xpath("//input[@value='Google Search']"));
	    WorkingWithWebBrowsers.GoBack();
	    WorkingWithWebBrowsers.Forward();
	    WorkingWithWebBrowsers.RefreshPage();
	    System.out.println("Passed Test");
	    WebDriverClass.getDriver().quit();
		}
}
