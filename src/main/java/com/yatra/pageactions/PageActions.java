package com.yatra.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
	public static void selectDropdown(WebDriver driver, String xpath, String visibleText) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);
	}

	public static void clickOnElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public static void sendKeys(WebDriver driver, String xpath, String value) throws Exception {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}

	public static void performActionEnter(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath));
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}

	public static void sendKeys(Keys enter) {
	}

	public static void explicitWait(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		@SuppressWarnings("unused")
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
}
