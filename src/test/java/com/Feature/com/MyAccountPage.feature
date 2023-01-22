		Feature: Verify the features of My Account Page
		
		Background:
		
		Scenario: Login into application with valid credentials
		
		Given User Launch the site URL
		And Allow cookies popup and age confirmation
		And User Enter Username and Password
		And Hover the mouse to account button and select the MyAccount
		
		@Regression
		
		Scenario: MYAC1001 My Account - Edit Account and Verify the account items text
		
		Given User Launch the site URL
		And Allow cookies popup and age confirmation
		And User Enter Username and Password
		And Hover the mouse to account button and select the MyAccount
		And Verify the title of the page
		And Assert that "ACCOUNT_OVERVIEW_TEXT.key" is displayed
		And Assert that "EDIT_DETAILS_BUTTON.key" is displayed
		And Assert that "CHANGE_PASSWORD_BUTTON.key" is displayed
		And Assert that "EDIT_ADDRESSESS_BUTTON.key" is displayed
		And User click on edit details button
		And Assert that "FIRST_NAME_INPUT.key" is present
		And Assert that "LAST_NAME_INPUT.key" is present
		And Assert that "DOB_INPUT.key" is present
		And Assert that "SAVE_CHANGES_BUTTON.key" is displayed
		
		@Regression
		Scenario: MYAC1002 My Account - Edit Account and Verify the button is enabled
		
		Given User Launch the site URL
		And Allow cookies popup and age confirmation
		And User Enter Username and Password
		And Hover the mouse to account button and select the MyAccount
		And Verify that edit button is enabled
		And Verify that change password button is enabled
		And Verify that edit address button is enabled
