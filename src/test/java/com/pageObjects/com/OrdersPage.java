package com.pageObjects.com;

import org.openqa.selenium.By;

import com.BaseClass.com.BaseClass;

public class OrdersPage extends BaseClass {

	public By yourOrders = By.xpath("//a[contains(text(),'Your orders')]");


	public void selectYourOrders() {

		try {
			waitForExpectedElement(yourOrders, 20).click();

		} catch (Exception e) {
			waitForExpectedElement(yourOrders, 20).click();
		}
	}
}