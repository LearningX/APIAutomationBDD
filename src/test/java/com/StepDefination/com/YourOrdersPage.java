package com.StepDefination.com;

import org.junit.Assert;

import com.BaseClass.com.BaseClass;
import com.pageObjects.com.HomePage;
import com.pageObjects.com.OrdersPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class YourOrdersPage extends BaseClass {


	HomePage homePage = new HomePage();
	OrdersPage orderPage = new OrdersPage();

	@Given("Hover the mouse to account button and select the Your Orders")

	public void hoverMouseAccountButtonAndSelectYourOrders() {

		try {

			homePage.hoverElementToMyAccount();

		} catch (Exception e) {

			homePage.hoverElementToMyAccount();

		}

		orderPage.selectYourOrders();

	}

	@And("Verify the title of the our order page")

	public void verifyTheTitleOrderPage() {

		Assert.assertEquals(driver.getTitle(), "Recent Orders");

	}

}
