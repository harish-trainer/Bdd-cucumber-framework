package utils;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import factories.DriverFactory;

public class ElementUtils {

	public void doClick(WebElement element, long waitTimeInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), waitTimeInSeconds);
			WebElement waitElement = null;
			waitElement = wait.until(ExpectedConditions.elementToBeClickable(element));
			waitElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void doClick(WebElement element) {
		try {
	
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doSendKeys(WebElement element, String text) {
		try {
			element.click();
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
