Feature: Login feature
This includes login validation
1)Valid case
2)Invalid case
Background:
Given We should be in home page
@validcase
Scenario: to validate with login
When Enter valid name
And Enter valid passowrd and click
Then Login successfull

