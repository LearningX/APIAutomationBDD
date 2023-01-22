package com.StepDefination.com;

import com.BaseClass.com.BaseClass;
import com.pageObjects.com.HomePage;
import com.pageObjects.com.SignOutPage;

import io.cucumber.java.en.And;

public class SignOutPageSteps extends BaseClass {

	public SignOutPageSteps() {
		super();
	}

	SignOutPage signOut = new SignOutPage();
	HomePage homePage = new HomePage();

	@And("User navigate to my account and click on signout button")

	public void clickOnSignOutButton() {
		homePage.hoverElementToMyAccount();
		signOut.userClickOnSignOutLink();

	}

}
