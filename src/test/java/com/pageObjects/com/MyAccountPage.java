package com.pageObjects.com;
	
import org.testng.Assert;
import org.openqa.selenium.By;
import com.BaseClass.com.BaseClass;
	
	public class MyAccountPage extends BaseClass {
	
	
	public By accountLinkIcon = By.cssSelector("div.column.desktop-only.customer_action > a > span");
	public By myAccountLink = By.cssSelector("div.userLoggin > div > div > div > ul > li:nth-child(1) > a");
	public By editDetailsButton = By.xpath("//span[contains(text(),'Edit details')]");
	public By changePasswordButton = By.xpath("//span[contains(text(),'Change password')]");
	public By editAddressButton = By.xpath("//span[contains(text(),'Edit addresses')]");
	
	public void clickOnMyAccountLink() {
	
	hoverOnElement(accountLinkIcon, 10);
	waitForExpectedElement(myAccountLink, 20).click();
	}
	
	public void getTheTitleOfMyAccountPage() {
	String actualTitleMyAccount = driver.getTitle();
	String expectedTitleMyAccount = "My Account";
	
	Assert.assertEquals(actualTitleMyAccount, expectedTitleMyAccount);
	}
	
	public void clickOnEditDetailsButton() {
	try {
	waitForExpectedElement(editDetailsButton, 20).click();
	}
	catch (Exception e) {
	driver.navigate().refresh();
	waitForExpectedElement(editAddressButton, 20).click();
	}
	}
	
	public void verifyTheEditDetailsButtonIsEnabled() {
	Assert.assertTrue(waitForExpectedElement(editDetailsButton, 30).isEnabled());
	
	}
	
	public void verifyTheChangePasswordButtonIsEnabled() {
	Assert.assertTrue(waitForExpectedElement(changePasswordButton, 10).isEnabled());
	}
	
	public void verifyTheEditAddressButtonIsEnabled() {
	Assert.assertTrue(waitForExpectedElement(editAddressButton, 10).isEnabled());
	}
	
	public void clickOnChangePaswordButton() {
		waitForExpectedElement(changePasswordButton, 20).click();
	}
	}
