Feature: Login feature
This includes login validation
1)Valid case
2)Invalid case

Background:
Given We should be in home page 

@validcase
Scenario: to validate with login
When Enter valid name #"Admin"
And Enter valid passowrd #"admin123"
And Click on Login #validButton
Then I should see the userName #as "Welcome Paul"	

#Scenario Outline: To test login with Diffrent Data
#When Enter valid name "<user>"
#And Enter valid passowrd "<pwd>"
#And Click on Login validButton
#Then I should see the userName as "<loginName>"	
#
#Examples:
#|user |pwd     |logiName    |
#|Admin|admin123|Welcome Paul|
#|Admin|admin123|Welcome Paul|
#



@Invalidcase
Scenario: To validate invalid case
When Enter invalid name #"Itly"
And Enter invalid passowrd #"Itly"
And click on Login #invalidButton
Then I should see the invalid credential #as "Invalid credentials"
