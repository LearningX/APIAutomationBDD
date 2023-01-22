
Feature: Check the login functionality

  @Regression
     Scenario: Login into application with valid credentials
     Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter Username and Password
     
     @Regression
     Scenario Outline: Check login functionality with different Usernames and Password
     
     Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter invalid data "<Username>" and "<Password>"
   
  Examples:
  |Username  |Password|
  |test19@mailinator.com         |Test@123|
  |test19@gmail.com  						|Test@123456|
  |test19@gmail.com							 |           |
  | 													|Test@123456|
  |deepak@gmail.com         |Test@123|
 
  @Regression
  Scenario: Verify the username error message when username is blank
     
     Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter incorrect data of "USERNAME_1.key" and "PASSWORD_1.key"
     Then User verify the invalid message "BLANK_EMAIL_ERROR_MESSAGE"
 
  @Regression  
  Scenario: Verify the password error message when password is blank
     
     Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter incorrect data of "USERNAME_2.key" and "PASSWORD_2.key"
     Then User verify the invalid message "BLANK_PASSWORD_ERROR_MESSAGE"
     
  @Regression  
  Scenario: Verify the username error message when username is incorrect format
     
     Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter incorrect data of "USERNAME_3.key" and "PASSWORD_3.key"
     Then User verify the invalid message "USER_NAME_INCORRECT_FORMAT_ERROR_MESSAGE"
     
     @Regression  
  Scenario: Verify the username error message when both username and password is incorrect format
     
     Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter incorrect data of "USERNAME_4.key" and "PASSWORD_4.key"
     Then User verify the invalid message "USERNAME_AND_PASSWORD_INCORRECT_ERROR_MESSAGE"
     
   
     