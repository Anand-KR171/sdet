Feature: To Validate Login Application
1) Valid Case
2) Invalid Case

Background:
Given we should be in the home page

#Scenario: To test Login with valid scenario
#When Enter the valid name "admin"
#And Enter the valid password "admin123"
#And Click on the Validbutton
#Then I see the name as "Welcome Paul"

#To test mulitple scenario / multiple data for one scenario you are scenario outline 
Scenario Outline: To test Login with valid scenario
When Enter the valid name "<user>"
And Enter the valid password "<pwd>"
And Click on the Validbutton
Then I see the name as "<username>"

Examples: 
|user|pwd|username|
|admin|admin123|Welcome Paul|
|admin|admin123|Welcome Paul|

@InValidCase
Scenario: To test Login with invalid scenario
When Enter the invalid name "anand"
And Enter the invalid password "anand"
And Click on the Invlaidbutton
Then i want to see the invalid as "Invalid credentials"