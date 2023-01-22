package com.pageObjects.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.BaseClass.com.BaseClass;

import org.testng.Assert;

public class HomePage extends BaseClass {

	public By AllowCookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");
	public By AllowAge = By.xpath("//button[@id='btn-entry-age-allow']");
	public By accoutnLink = By.cssSelector("div.column.desktop-only.customer_action > a > span");
	public By signInLink = By.cssSelector("div.userLoggout>div > div > div > ul>li:nth-child(1) > a");
	public By searchProduct = By.xpath("//input[@id='search']");
	public By homePageLogo = By.cssSelector("header > div.header-vype.row > div.column.logo-container > a > img");
	public By shopDeviceProduct = By.cssSelector("li:nth-child(9) > div > div.product-item-group > div.product.name > a");

	public void selectAllCookiesAndAcceptAge() {
		waitForExpectedElement(AllowCookies, 10).click();
		waitForExpectedElement(AllowAge, 10).click();

	}

	public void hoverElementToMyAccount() {
		try {
			waitForExpectedElement(accoutnLink, 20).click();;
		} catch(Exception e) {
			hoverOnElement(accoutnLink);
		}
	}

	public void userClickOnSignInLink() throws InterruptedException {

		waitForExpectedElement(accoutnLink, 10).click();
		waitForExpectedElement(signInLink, 5).click();
		Thread.sleep(5000);
	}

	public void searchTheProduct() {
		try {
			waitForExpectedElement(searchProduct,30).sendKeys("VUSE");
			waitForExpectedElement(searchProduct, 20).sendKeys(Keys.ENTER);
		}catch(Exception e) {
			waitForExpectedElement(searchProduct,30).sendKeys("VUSE");
			waitForExpectedElement(searchProduct, 20).sendKeys(Keys.ENTER);
		}
	}

	public void clickShopDevicesLink() {
		WebElement shopDevice = driver.findElement(By.cssSelector
				("nav > div.custom-categories > div > div > ul > li.level0.category-item.icon-devices.first"));
		shopDevice.click();
	}

	public void verifyTheLogoHomePage() {

		try {
			boolean homeLogo =	waitForExpectedElement(homePageLogo, 20).isDisplayed();
		}
		catch(Exception e) {
			waitForExpectedElement(homePageLogo, 10).isDisplayed();
		}
		boolean homeLogo =	waitForExpectedElement(homePageLogo, 20).isDisplayed();
		Assert.assertEquals(true, homeLogo);

	}
	public void hoverElementOnProduct() {
		try {
		hoverOnElement(shopDeviceProduct);	
	} catch (Exception e) {
		hoverOnElement(shopDeviceProduct);
	}
}
}