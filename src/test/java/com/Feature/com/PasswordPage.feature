Feature: (PSWD)Verify the Password Page Functionality
     
     @Regression
 		 Scenario: PSWD01 Verify the confirm password error message when confirm password does not match with new password
 		 Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter Username and Password
     And Hover the mouse to account button and select the MyAccount
     And On My Account Page user click on change password button
     And User select change password checkbox
     And User enter current Password "CURRENT_PASSWORD.key"
     And User enter new Password "NEW_PASSWORD.key"
     And User enter confirm new Password "INCORRECT_CONFIRM_NEW_PASSWORD.key"
     And User click on save changes button
     Then User verify the password invalid message "INCORRECT_CONFIRM_PASSWORD_ERROR_MESSAGE.key"
  	
  	 @Regression
 		 Scenario: PSWD02 Verify the password length(when length of password is less than required character) error message
 		 Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter Username and Password
     And Hover the mouse to account button and select the MyAccount
     And On My Account Page user click on change password button
     And User select change password checkbox
     And User enter current Password "CURRENT_PASSWORD.key"
     And User enter new Password "NEW_PASSWORD_LENGTH_LESS_THAN_8_CHAR.key"
     And User click on save changes button
     Then User verify the password invalid message "PASSWORD_LENGHT_LESS_THAN_REQUIRED_CHARACTER_ERROR_MESSAGE.key"
     
     @Regression
 		 Scenario: PSWD03 Verify the password (when all character of password are same) error message
 		 Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter Username and Password
     And Hover the mouse to account button and select the MyAccount
     And On My Account Page user click on change password button
     And User select change password checkbox
     And User enter current Password "CURRENT_PASSWORD.key"
     And User enter new Password "NEW_PASSWORD_ALL_CHARACTER_SAME.key"
     Then User verify the password invalid message "PASSWORD_CONTAINS_DIFFERENT_CHARACTER_ERROR_MESSAGE.key"
   
     @Regression
 		 Scenario: PSWD04 Verify the current password (when current password is blank) error message
 		 Given User Launch the site URL
     And Allow cookies popup and age confirmation
     And User Enter Username and Password
     And Hover the mouse to account button and select the MyAccount
     And On My Account Page user click on change password button
     And User select change password checkbox
     And User enter current Password "BLANK_CURRENT_PASSWORD.key"
     And User enter new Password "NEW_PASSWORD.key"
     And User enter confirm new Password "CONFIRM_NEW_PASSWORD.key"
     Then User verify the password invalid message "CURRENT_PASSWORD_IS_REQUIRED_ERROR_MESSAGE.key"
     
