
Feature: Verify the Order Page Elements

@Regression 

Scenario: MYYO1001 Your Orders- Verify the all the orders 

Given User Launch the site URL 
And Allow cookies popup and age confirmation 
And User Enter Username and Password	 
Given Hover the mouse to account button and select the Your Orders		 
And Verify the title of the our order page		 
And Assert that "ORDER_HISTORY-MESSAGE.key" is displayed