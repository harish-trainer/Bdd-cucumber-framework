package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	
	private By accountCreatedMessage = By.xpath("//*[text()='Thank you for registering with Fake Online Clothing Store.']");
	
	
	public WebElement getAccountCreatedMessage() {
		return driver.findElement(accountCreatedMessage);
	}
}
