package com.StepDefination.com;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;

import com.BaseClass.com.BaseClass;
import com.pageObjects.com.MyAccountPage;
import com.pageObjects.com.PasswordPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PasswordPageSteps extends BaseClass {

	MyAccountPage myAccount = new MyAccountPage();
	PasswordPage passwordPage = new PasswordPage();

	@And("On My Account Page user click on change password button")
	public void clickOnTheChangePasswordButton() {
		myAccount.clickOnChangePaswordButton();
	}

	@And("User select change password checkbox")
	public void clickOnChangePasswordCheckBox() throws IOException {
		passwordPage.selectChangePasswordCheckBox();
		takeScreenSort();
	}

	@And("User enter current Password {string}")
	public void userEnterCurrentPassword(String currentPasswd) {
		passwordPage.enterCurrentPassword(currentPasswd);
	}

	@And("User enter new Password {string}")
	public void userEnterNewPassword(String newPassws) {
		passwordPage.enterNewPassword(newPassws);
	}

	@And("User enter confirm new Password {string}")
	public void userEnterConfirmNewPassword(String confirmPasswd) {
		passwordPage.enterConfirmNewPassword(confirmPasswd);
	}

	@And("User click on save changes button")
	public void clickSaveChangesButtonOnPasswordPage() {
		passwordPage.clickOnSaveChangesButtonToChangePassword();
	}

	@Then("User verify the password invalid message {string}")
	public void verifyThePasswordInvalidMessage(String passwordInvalidMessage) {
		// boolean expectedText= driver.getPageSource().toLowerCase().contains(prop.getProperty(passwordInvalidMessage).toLowerCase());
		assertTrue(driver.getPageSource().toLowerCase().contains(prop.getProperty(passwordInvalidMessage).toLowerCase())); 
	}


}