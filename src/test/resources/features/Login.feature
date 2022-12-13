Feature: Login with a account


Scenario Outline: user able to login with existing account

Given user is on LUMA application
When user clicks on my account dropdown
And user clicks on Login
Then he lands on the login page
When he enters the "<user name>" and "<password>"
And he clicks on login button
Then user is on your store page

Examples:
|user name|	password |
|dafasa		|vfds|

