package webdriver.selenium.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WorkingWithWebButtons {
	public static WebElement element;
	
	public static void ClickButton(By locator) {
	    element = WorkingWithWebElements.GetElement(locator);
		element.click();
		}
	
	public static boolean IsButtonEnabled(By locator)
    {
        element = WorkingWithWebElements.GetElement(locator);
        return element.isEnabled();
    }

    public static String GetButtonText(By locator)
    {
        element = WorkingWithWebElements.GetElement(locator);
        if (element.getAttribute("value") == null)
            return "";
        return element.getAttribute("value");
    }
}
