
Feature: This is a Login feature Sprint1

@nahida1
Scenario: Verify user can signup
Given open "<URL>" Application
Then Click SignupLink
Then Enter user password
Then click SignUp button





@nahida2
Scenario: Verify user can login with valid card
Given open "<URL>" Application
Then Click Login Link
Then Enter username password
Then Verify user can login with valid card