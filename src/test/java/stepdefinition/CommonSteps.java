package stepdefinition;

import factories.DriverFactory;
import io.cucumber.java.en.Given;

public class CommonSteps {
	
	@Given("User is on open cart application")
	public void user_is_on_open_cart_application() {
	   DriverFactory.getDriver().get("https://demo.opencart.com/");
	}

}
