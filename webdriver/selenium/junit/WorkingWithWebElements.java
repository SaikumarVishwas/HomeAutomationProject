package webdriver.selenium.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WorkingWithWebElements {
	public static WebElement element;

	public static WebElement GetElement(By locator) 
    {
		System.out.println(WebDriverClass.getDriver().getTitle());
		element = WebDriverClass.getDriver().findElement(locator);
		System.out.println(element);
		System.out.println(element.getAttribute("type"));
		return element;
               }  
	}

