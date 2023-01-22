package com.pageObjects.com;

import org.openqa.selenium.By;
import com.BaseClass.com.BaseClass;

public class PDPPage extends BaseClass {

	public static By productLink = By.xpath("(//a[@class='product-item-link'])[1]");
	public static By addCartButton = By.xpath("//button[@id='product-addtocart-button']");

	public void userNavigateToPDPPage() {
		waitForExpectedElement(productLink, 10).click();
	}

	public void productAddToCartButton() {
		clickElementByJSExecutor(addCartButton);
		// waitForExpectedElement(addCartButton, 20).click();
	}
}