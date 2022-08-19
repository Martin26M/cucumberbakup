Feature: This is a new Feature
Scenario: Test  login with valid credentials
Given When the user is on the LoginPage 
When the user clicks on Login Button
Then user should be taken to Home Page
And user should see the page title 
