package com.yatra.pages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.yatra.pageactions.PageActions;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.LogReports;
import com.yatra.utils.ReadLocatorsFile;
import com.yatra.validation.ValidateBusDetails;

public class BookingPage {
	public static void searchingBusPage(WebDriver driver,Properties properties,LogReports log) throws Exception
	{
		
		PageActions.clickOnElement(driver, properties.getProperty("clickBuses"));
		PageActions.clickOnElement(driver, properties.getProperty("clickFromPlace"));
		Thread.sleep(3000);
		PageActions.sendKeys(driver, properties.getProperty("clickFromPlace"), "Hyderabad");
		Thread.sleep(3000);
		PageActions.performActionEnter(driver, properties.getProperty("clickFromPlace"));
		log.info("Clicked fromplace");
		PageActions.clickOnElement(driver, properties.getProperty("clickToPlace"));
		Thread.sleep(3000);
		PageActions.sendKeys(driver, properties.getProperty("clickToPlace"), "Bangalore");
		Thread.sleep(3000);
		PageActions.performActionEnter(driver, properties.getProperty("clickToPlace"));
		log.info("Clicked toplace");
		PageActions.clickOnElement(driver, properties.getProperty("clickDate"));
		PageActions.clickOnElement(driver, properties.getProperty("clickDateValue"));
		log.info("clicked date");
		PageActions.clickOnElement(driver, properties.getProperty("clickSearchBuses"));
	}
	public static void selectingBusPage(WebDriver driver,Properties properties,LogReports log) throws Exception {
		PageActions.clickOnElement(driver, properties.getProperty("busTypeSeater"));
		PageActions.clickOnElement(driver, properties.getProperty("busTypeSemiseater"));
		PageActions.clickOnElement(driver, properties.getProperty("busTypeNonAC"));
		PageActions.clickOnElement(driver, properties.getProperty("clickNo.ofPassengers"));
		PageActions.sendKeys(driver, properties.getProperty("clickNo.ofPassengers"), "3");
		PageActions.sendKeys(Keys.ENTER);
		PageActions.clickOnElement(driver, properties.getProperty("clickDuration"));
		PageActions.clickOnElement(driver, properties.getProperty("selectBuses"));
		log.info("Selected bus as per requirements");
	}
	public static void bookingBusPage(WebDriver driver,Properties properties,LogReports log) throws Exception {
		PageActions.clickOnElement(driver, properties.getProperty("clickFirstBusSeat"));
		PageActions.clickOnElement(driver, properties.getProperty("clickSecondBusSeat"));
		PageActions.clickOnElement(driver, properties.getProperty("clickThirdBusSeat"));
		log.info("Completed seats booking");
		ValidateBusDetails.validatingBusName();
		ValidateBusDetails.validatingBusType();
		PageActions.clickOnElement(driver, properties.getProperty("clickBordingPoint"));
		PageActions.clickOnElement(driver, properties.getProperty("clickBordingPointAddress"));
		log.info("entered bording point");
		ValidateBusDetails.validatingSeatsNumber();
		ValidateBusDetails.validatingTotalFare();
		PageActions.clickOnElement(driver, properties.getProperty("clickContinue"));
	}
	public static void sendDetailsPage(String email,String phoneNumber,WebDriver driver,Properties properties,LogReports log) throws Exception {
		PageActions.clickOnElement(driver, properties.getProperty("clickEmailAddress"));
		PageActions.sendKeys(driver, properties.getProperty("clickEmailAddress"),email);
		
		PageActions.clickOnElement(driver, properties.getProperty("enterPhoneNumber"));
		PageActions.sendKeys(driver, properties.getProperty("enterPhoneNumber"),phoneNumber);
		log.info("Entered email and phoneno for corfirmation");
		PageActions.clickOnElement(driver, properties.getProperty("clickBookasGuest"));
	}
	public static void fillingDetailsPage(WebDriver driver,Properties properties,LogReports log,String title,String name,String age) throws Exception
	{
	PageActions.clickOnElement(driver, properties.getProperty("clickFirstPassengerTitle"));
	PageActions.sendKeys(driver, properties.getProperty("clickFirstPassengerTitle"), title);
	PageActions.performActionEnter(driver, properties.getProperty("clickFirstPassengerTitle"));

	PageActions.clickOnElement(driver, properties.getProperty("enterFPName"));
	PageActions.sendKeys(driver, properties.getProperty("enterFPName"), name);
	PageActions.performActionEnter(driver, properties.getProperty("enterFPName"));

	PageActions.clickOnElement(driver, properties.getProperty("clickFPAge"));
	PageActions.sendKeys(driver, properties.getProperty("clickFPAge"), age);
	PageActions.performActionEnter(driver, properties.getProperty("clickFPAge"));

	PageActions.clickOnElement(driver, properties.getProperty("clickSeconfPassengerTitle"));
	PageActions.sendKeys(driver, properties.getProperty("clickSeconfPassengerTitle"), title);
	PageActions.performActionEnter(driver, properties.getProperty("clickSeconfPassengerTitle"));

	PageActions.clickOnElement(driver, properties.getProperty("enterSPName"));
	PageActions.sendKeys(driver, properties.getProperty("enterSPName"), name);
	PageActions.performActionEnter(driver, properties.getProperty("enterSPName"));

	PageActions.clickOnElement(driver, properties.getProperty("clickSPAge"));
	PageActions.sendKeys(driver, properties.getProperty("clickSPAge"), age);
	PageActions.performActionEnter(driver, properties.getProperty("clickSPAge"));

	PageActions.clickOnElement(driver, properties.getProperty("clickThirdPassengerTitle"));
	PageActions.sendKeys(driver, properties.getProperty("clickThirdPassengerTitle"), title);
	PageActions.performActionEnter(driver, properties.getProperty("clickThirdPassengerTitle"));

	PageActions.clickOnElement(driver, properties.getProperty("enterTPName"));
	PageActions.sendKeys(driver, properties.getProperty("enterTPName"), name);
	PageActions.performActionEnter(driver, properties.getProperty("enterTPName"));

	PageActions.clickOnElement(driver, properties.getProperty("clickTPAge"));
	PageActions.sendKeys(driver, properties.getProperty("clickTPAge"), age);
	PageActions.performActionEnter(driver, properties.getProperty("clickTPAge"));

	log.info("Entered all passenger details");
	PageActions.clickOnElement(driver, properties.getProperty("continueToPaymentPage"));
	log.info("Sucessfully automated test cases");
}
}
