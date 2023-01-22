
package com.StepDefination.com;

import com.BaseClass.com.BaseClass;
import com.pageObjects.com.CartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartPageSteps extends BaseClass {
	CartPage cartPage = new CartPage();

	@Then("User verify the Mini Cart Page Title")
	public void verifyMiniCartTitle() {
		cartPage.verifyMiniCartTitle();
	}

	@Then("Verify mini basket count {string}")
	public void verifyMiniBasketCount(String basketCount) {
		cartPage.countItemInBasket(basketCount);

	}

	@And("Check the cart is empty")
	public void checkTheCartIsEmpty() {
		cartPage.emptyCart();
	}

	@Then("User open basket click on view basket button")
	public void openBasketClickOnViewBasketButton() {
		cartPage.openBasketClickOnViewBasketButton();

	}

	@Then("If cart is then user verify the empty cart message is displayed or not")
	public void verifyEmptyCartTMessage() {
		cartPage.emptyCartTextVerify();
	}

}