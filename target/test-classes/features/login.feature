Feature: Log into the application

Scenario Outline: Positive test validating login
Given Initialize browser with Chrome
And  Navigate to "https://rahulshettyacademy.com/#/index" site
And Click on Login Link to login to Secure login page
When User enters <username> and <password> and logs in
Then verify the user is successfully logged in
  
 Examples:
 |username			|password		|
 |test99@gmail.com	|test99			|
 |test123@gmail.com	|test123		|
 