Feature: Login and compose and verify message
Background:
Given Give URL
@LoginAndVerify
Scenario Outline: Verify the mail
When Enter username "<name>"
And Enter password and click login "<passwd>"
Then Verify the mail "<status>"
Examples:
| name    | passwd       | status                   |
| admin   |admin@123     |mohankrishna176@gmail.com |
|Itishree1|Itishree@123  |nayak.itishree89@gmail.com|
@Compose
Scenario: Compose mail and send
 When Do login "Itishree1" "Itishree@123"
 And Go to inbox and click on compose
 And Type message
 Then Verify message
