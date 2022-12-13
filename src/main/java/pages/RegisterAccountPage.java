package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtils;

public class RegisterAccountPage extends ElementUtils{
	WebDriver driver;
	
	ElementUtils elementUtils = new ElementUtils();

	// locators
	private By firstName = By.name("firstname");
	private By lastName = By.name("lastname");
	private By eMail = By.name("email");
	private By pwd = By.name("password");
	private By conformPwd = By.name("password_confirmation");
	private By termsAndCondition = By.xpath("//input[@type='checkbox'][@name='agree']");
	private By createAccountButton = By.xpath("//button[@type='submit']/span[text()='Create an Account']");

	// 2. Constructor of the page class:
	public RegisterAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3.page actions:
	public void enterFirstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}

	public void enterEMail(String email) {
		driver.findElement(eMail).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void enterconformPassword(String password) {
		elementUtils.doSendKeys(driver.findElement(conformPwd), password);
		//driver.findElement(conformPwd).sendKeys(password);
	}

	public void clickSubmit() {
		elementUtils.doClick(driver.findElement(createAccountButton), 10);
		//driver.findElement(createAccountButton).click();
	}

	public void enterDetails(String firstname, String lastname, String email, String password) {
		enterFirstName(firstname);
		enterLastName(lastname);
		enterEMail(email);
		enterPassword(password);
		enterconformPassword(password);
	}

}
