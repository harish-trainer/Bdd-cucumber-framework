package parallel;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefs {
	
	@Given("I want to book one way flight ticket from Dublin to London on 22nd July for 2 adults and 2 kids")
    public void singleTrip(){
         System.out.println("I want to book one way flight ticket from Dublin to London on 22nd July for 2 adults and 2 kids");
    }
   
 @Then("TripAdvisor should provide me options to book flight ticket")
    public void TripAdvisor(){
         System.out.println("TripAdvisor should provide me options to book flight ticket");
    }
  
 @Given("I want to book roundtrip flight ticket from Dublin to India on 30th June and return 10th July for 2 adults and 1 kid")
    public void roundTrip(){
         System.out.println("I want to book one way flight ticket from Dublin to London on 22nd July for 2 adults and 2 kids");
    }
 
 @Given("I want to book one way train ticket from Dublin to Cork on 10th June for 2 adults and 2 kids")
 public void hotelWithoutBreakfast(){
      System.out.println("I want to book one way train ticket from Dublin to Cork on 10th June for 2 adults and 2 kids");
 }

@Then("IrishRail should provide me options to book train ticket for the specified date")
 public void Trivago(){
      System.out.println("IrishRail should provide me options to book train ticket for the specified date");
 }

@Given("User is on Home page")
public void userOnHomePage() {

	System.out.println("User is on Home page");
}

@When("User enters username as {string}")
public void entersUsername(String userName) throws InterruptedException {

    System.out.println("Username Entered");


}

@When("User enters password as {string}")
public void entersPassword(String passWord) throws InterruptedException {

    System.out.println("Password Entered");
    

    
}

@Then("User should be able to login sucessfully")
public void sucessfullLogin() throws InterruptedException {

	 System.out.println("User should be able to login sucessfully");

}
@Given("User login with valid credentials")
public void entersCredentials() throws InterruptedException {
    
	 System.out.println("User login with valid credentials");
}

@When("User is in Dashboard page")
public void verifyDashboardPage() {

	 System.out.println("User is in Dashboard page");
}

@Then("there are valid QuickLaunch options {string}")
public void verifyQuickLinks(String options) throws InterruptedException {
	System.out.println("there are valid QuickLaunch options");

}

@Then("there are valid Legend options {string}")
public void verifyMenuOptions(String options) throws InterruptedException {
	System.out.println("there are valid Legend options {");

}
}
