Feature: Your Store Home Page features

Scenario: Validate user able to navigate to new account opening page

Given user is on open cart application
When user clicks on my account dropdown
And user clicks on Register
Then user is on the new registration page

Scenario Outline: Validate user able to navigate to <product> page when clicked on it

Given user is on open cart application
When user clicks on <product> product
Then user is sees the title of the page as <product>

Examples:
|		product		|
|		iPhone		|