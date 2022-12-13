package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourStorePage {
	
	private WebDriver driver;
	
	//locators
	private By myAccount = By.xpath("//span[text()='My Account']");
	private By createAccountOption = By.xpath("//li/a[text()='Create an Account']");
	private By loginOption = By.xpath("//a[text()='Login']");
	
	// 2. Constructor of the page class:
			public YourStorePage(WebDriver driver) {
				this.driver = driver;
			}
			
	//3.page actions:
			public void clickMyAccount() {
				driver.findElement(myAccount).click();
			}
			
			public void clickRegisterOption() {
				driver.findElement(createAccountOption).click();
			}
			
			public void clickLoginOption() {
				driver.findElement(loginOption).click();
			}
			

}
