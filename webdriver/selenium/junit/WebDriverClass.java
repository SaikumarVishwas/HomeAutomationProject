package webdriver.selenium.junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class WebDriverClass {
	public static WebDriver driver=null;
	private WebDriverClass() {}
	public static WebDriver getDriver(){
		if(driver==null) {
		driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_24);
		}
		return driver;
	}
}
