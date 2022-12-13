package stepdefinition;

import factories.DriverFactory;
import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("user is on LUMA application")
	public void user_is_on_LUMA_application() {
		DriverFactory.getDriver().get("https://magento.softwaretestingboard.com/");
	    
	}

	@When("user clicks on my account dropdown")
	public void user_clicks_on_my_account_dropdown() {
	    
	}

	@When("user clicks on Login")
	public void user_clicks_on_login() {
	    
	}

	@Then("he lands on the login page")
	public void he_lands_on_the_login_page() {
	   
	}

	@When("he enters the {string} and {string}")
	public void he_enters_the_and(String string, String string2) {
	}

	@When("he clicks on login button")
	public void he_clicks_on_login_button() {
	   
	}

	@Then("user is on your store page")
	public void user_is_on_your_store_page() {
	   
	}
}
