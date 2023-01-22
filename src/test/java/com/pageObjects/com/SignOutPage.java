package com.pageObjects.com;

import org.openqa.selenium.By;

import com.BaseClass.com.BaseClass;

public class SignOutPage extends BaseClass{

	public By accountButton = By.xpath("//span[@class='icon-account']");
	public By signOutLink = By.cssSelector("div.userLoggin > div > div > div > ul > li.view-registration.switcher-option > a");

	
	public void userClickOnSignOutLink()  {
		waitForExpectedElement(signOutLink, 10).click();

	}
}
