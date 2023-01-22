package com.pageObjects.com;

import org.openqa.selenium.By;

import com.BaseClass.com.BaseClass;

public class PasswordPage extends BaseClass{

	public By changePasswordCheckBox = By.cssSelector("div.field.choice.choice-box__container.choice-password > label");
	public By currentPassword = By.cssSelector("#current-password");
	public By newPassword = By.xpath("//input[@id='password']");
	public By confirmNewPassword = By.xpath("//input[@id='password-confirmation']");
	public By saveChangesButton = By.xpath("//button[@class='action save primary']");


	public void selectChangePasswordCheckBox() {

		try {
			waitForExpectedElement(changePasswordCheckBox,20).click();
		}catch (Exception e) {
			waitForExpectedElement(changePasswordCheckBox,20).click();
		}  }

	public void enterCurrentPassword(String currentPass) {

		try {
			waitForExpectedElement(currentPassword,10).clear();
			waitForExpectedElement(currentPassword,20).sendKeys(prop.getProperty(currentPass));
		} catch (Exception e){
			waitForExpectedElement(currentPassword,20).sendKeys(prop.getProperty(currentPass));
		} }

	public void clickOnSaveChangesButtonToChangePassword() {

		clickElementByJSExecutor(saveChangesButton);
	}

	public void enterNewPassword(String newPass) {
		try {
			waitForExpectedElement(newPassword,10).clear();
			waitForExpectedElement(newPassword,20).sendKeys(prop.getProperty(newPass));
		} catch (Exception e) {
			waitForExpectedElement(newPassword,20).sendKeys(prop.getProperty(newPass));
		} }

	public void enterConfirmNewPassword(String confirmPass) {
		try {
			waitForExpectedElement(confirmNewPassword,10).clear();
			waitForExpectedElement(confirmNewPassword,20).sendKeys(prop.getProperty(confirmPass));
		} catch (Exception e) {
			waitForExpectedElement(confirmNewPassword,20).sendKeys(prop.getProperty(confirmPass));
		} }

} 