package com.StepDefination.com;

import org.testng.Assert;

import com.BaseClass.com.BaseClass;
import com.pageObjects.com.MyAccountPage;

import io.cucumber.java.en.And;

public class MyAccountPageSteps extends BaseClass {

	MyAccountPage account = new MyAccountPage();

	@And("Hover the mouse to account button and select the MyAccount")
	public void hoverMouseToAccountAndSelectMyAccount() {
		account.clickOnMyAccountLink();
	}

	@And("Verify the title of the page")
	public void verifyTheTitleOfThePage() {
		account.getTheTitleOfMyAccountPage();
	}

	@And("Assert that {string} is displayed")
	public void assertThatTextOnMyAccountPageIsDisplayed(String myAccountText) {

		boolean myAccountPageText = driver.getPageSource().toLowerCase()
				.contains(prop.getProperty(myAccountText).toLowerCase());
		Assert.assertEquals(myAccountPageText, true);
	}

	@And("User click on edit details button")
	public void userclickOnEditDetailsButtonOnMyAccountDashBaord() {
		account.clickOnEditDetailsButton();
	}

	@And("Assert that {string} is present")
	public void assertThatTextIsPresentOnMyAccountEditDetailsDashBoard(String editDetailsText) {
		boolean editDetails = driver.getPageSource().toLowerCase()
				.contains(prop.getProperty(editDetailsText).toLowerCase());
		Assert.assertEquals(editDetails, true);
	}

	@And("Verify that edit button is enabled")
	public void assertTheEditButtonIsEnabled() {
		account.verifyTheEditDetailsButtonIsEnabled();
	}

	@And("Verify that change password button is enabled")
	public void assertTheChangePasswordButtonIsEnabled() {
		account.verifyTheChangePasswordButtonIsEnabled();
	}

	@And("Verify that edit address button is enabled")
	public void assertTheEditAddressButtonIsEnabled() {
		account.verifyTheEditAddressButtonIsEnabled();
	}

}