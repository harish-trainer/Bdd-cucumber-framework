package stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

import factories.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.MyAccountPage;
import pages.RegisterAccountPage;
import pages.YourStorePage;
import utils.CSVReaderUtil;

public class RegisterAccountSteps {
	YourStorePage yourStorePage = new YourStorePage(DriverFactory.getDriver());
	RegisterAccountPage registerAccountPage = new RegisterAccountPage(DriverFactory.getDriver());
	MyAccountPage myAccountPage = new MyAccountPage(DriverFactory.getDriver());
	
	@Given("user is on new Account Registration form")
	public void user_is_on_new_account_registration_form() {
	    yourStorePage.clickRegisterOption();
	}

	@When("user enters the following details")
	public void user_enters_the_following_details(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		String firstName = data.get(0).get("First Name");
		String lastName = data.get(0).get("Last Name");
		String Email = data.get(0).get("E-mail");
		String Password = data.get(0).get("Password");
		registerAccountPage.enterDetails(firstName, lastName, Email, Password);
	}
	
	@When("a new customer is created")
	public void a_new_customer_is_created() throws FileNotFoundException, IOException {
		String firstName = RandomStringUtils.randomAlphabetic(5);
		String lastName = RandomStringUtils.randomAlphabetic(5);
		String Email = RandomStringUtils.randomAlphabetic(5) +"@gmail.com";
		String Password =RandomStringUtils.randomAlphanumeric(9);
		
		registerAccountPage.enterDetails(firstName, lastName, Email, Password);
	}


	@When("user Clicks on Create Account button")
	public void user_clicks_on_Create_account_button() {
		registerAccountPage.clickSubmit();
	   
	}

	@Then("a new account is created")
	public void a_new_account_is_created() {
		Assert.assertTrue(myAccountPage.getAccountCreatedMessage().getText().contains("Thank you for registering with Fake Online Clothing Store."));
	}

	@Then("he is not allowed to proceed from new registration page")
	public void he_is_not_allowed_to_proceed_from_new_registration_page() {
		
	}


}
