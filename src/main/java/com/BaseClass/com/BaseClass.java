package com.BaseClass.com; 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;

	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\saura\\git\\LearningAutomation\\com.SwagLab.com\\Properties\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public void launchBrowser() {
		driver.get(prop.getProperty("url"));
	}

	public void hoverOnElement(final By by) {

		Actions action = new Actions(getWebDriver());
		action.moveToElement(getWebDriver().findElement(by)).build().perform();

	}
	public void hoverOnElement(final By by, int waitTime) { // hover mouse

		Actions action = new Actions(getWebDriver());
		action.moveToElement(getWebDriver().findElement(by)).build().perform();
	}

	public WebElement waitForExpectedElement(final By by, int wait_element) {
		wait = new WebDriverWait(driver, wait_element); 
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public WebElement waitForElementVisible(final WebElement element, int wait_visible) {

		WebDriverWait wait = new WebDriverWait(getWebDriver(), wait_visible);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void dropDownSelectByValue(final By by, String textValue) {
		Select dropdownByValue = new Select(waitForExpectedElement(by, 10)); 
		dropdownByValue.selectByValue(textValue);
	}

	public static void takeScreenSort() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver; // Convert web driver object to TakeScreenshot
		File source = ts.getScreenshotAs(OutputType.FILE); // getScreenshotAs method to create image file
		//	String currentDiretory = System.getProperty("user.dir");
		FileUtils.copyFile(source, new File( ".//screenshorts//" + System.currentTimeMillis() + ".png"));
		// copy file at destination from Source to Destination and filename format
	}

	public void clickElementByJSExecutor(final By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));	// first use explicit wait condition
		JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
		jse.executeScript("arguments[0].scrollIntoView()", waitForExpectedElement(by,10));
		jse.executeScript("arguments[0].click()", waitForExpectedElement(by, 10));

	}

}

