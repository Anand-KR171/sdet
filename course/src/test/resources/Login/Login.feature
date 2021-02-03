Feature: To Validate Login Application
1) Valid Case
2) Invalid Case
Background:
Given we should be in the home page
@Validcase
Scenario: To test Login with valid scenario
When Enter the valid name
And Enter the valid password and Click on the login button
Then Login should be successfully

@InValidCase
Scenario: To test Login with invalid scenario
When Enter the invalid name
And Enter the invalid password and Click on the login button
Then Login should be unsuccessful 