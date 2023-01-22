Feature: Verify the basket functionality 

Background: 

Scenario: Login into applicatio with valid credentials 	
Given User Launch the site URL 	
And Allow cookies popup and age confirmation 	
And User Enter Username and Password 
And Check the cart is empty 
Then If cart is then user verify the empty cart message is displayed or not	


@Regression 
Scenario: Verify user is able to add the product into the basket from PDP page 	
And User Search the Product	
And User Navigate to PDP Page 	
And Click on add to cart button 	
Then User verify the Mini Cart Page Title 	
Then Verify mini basket count "NO_OF_ITEMS_IN_CART.key" 	
Then User open basket click on view basket button 

@Regression 

Scenario: Verify user is able to add the product into the basket from PDP page for non-logged in Users	
Given User Launch the site URL 	
And Allow cookies popup and age confirmation	
And User Search the Product	
And User Navigate to PDP Page	
And Click on add to cart button	
Then User verify the Mini Cart Page Title	
Then Verify mini basket count "NO_OF_ITEMS_IN_CART.key"
