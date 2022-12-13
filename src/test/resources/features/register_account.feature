Feature: Account Registration feature

Background:
Given user is on LUMA application

Scenario: Validate user able to register his account

Given user is on new Account Registration form
When a new customer is created
When user enters the following details
|	First Name	|	Last Name	|	E-mail						|	Password	|
|	sfdscxdsvdsv			|	Rdajcdscsddsdad			|	hcsarsdcsidsdhss@gmail.com	|	Adbscsxsxdsdc@1234	|
And user Clicks on Create Account button
Then a new account is created

@mytest
Scenario: Validate user not able to register his account with invalid data

Given user is on new Account Registration form
When a new customer is created
When user enters the following details
|	First Name	|	Last Name	|	E-mail						|	Password	|
|	Harish			|	Raj				|	harish@gmail.com	|	Abcd@1234qae	|
And user Clicks on Create Account button
Then he is not allowed to proceed from new registration page