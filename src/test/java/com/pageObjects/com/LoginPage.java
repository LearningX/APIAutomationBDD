package com.pageObjects.com;

import java.io.IOException;

import org.openqa.selenium.By;

import com.BaseClass.com.BaseClass;

public class LoginPage extends BaseClass {

	public static By emailAddress = By.xpath("//input[@id='email']");
	public static By password = By.xpath("//input[@name='login[password]']");
	public static By singInButton = By.xpath("(//button[@id='send2'])[1]");

	public void enterSignInDetails() {

		waitForExpectedElement(emailAddress, 10).sendKeys(prop.getProperty("username"));
		waitForExpectedElement(password, 10).sendKeys(prop.getProperty("password"));

		try {
			takeScreenSort();
		} catch (IOException e) {

			e.printStackTrace();
		}

		waitForExpectedElement(singInButton, 5).click();

	}

	public void enterUsernameAndPassword(String Username, String Password) {

		waitForExpectedElement(emailAddress, 10).sendKeys(Username);
		waitForExpectedElement(password, 10).sendKeys(Password);
		waitForExpectedElement(singInButton, 10).click();
	}

	public void enterSignInDetailsToAssertErrorMessage(String uname, String pswd) {

		waitForExpectedElement(emailAddress, 10).sendKeys(prop.getProperty(uname));
		waitForExpectedElement(password, 10).sendKeys(prop.getProperty(pswd));
		waitForExpectedElement(singInButton, 10).click();
	}

}
