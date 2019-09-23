package com.yatra.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.yatra.testbase.TestBase;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.ReadLocatorsFile;

public class ValidateBusDetails extends TestBase {
	static String xpath;
	static Properties properties;
	static String actualbusname;
	static String actualbustype;
	static String actualseatnumbers;
	static String actualtotalfare;
	static String actualbordingpoint;
	static String actualbordingpointaddress;
	static String expectedbusname = "Ullal Holidays";
	static String expectedbustype = "AC Sleeper (2 + 1)";
	static String expectedseatnumbers = "L18, L17, L16";
	static String expectedtotalfare = "2,700";
	static String expectedbordingpoint = "Y Junction";
	static String expectedbordingpointaddress = "INFRONT OF SAGAR HOTEL, PH No : 7353019999 , 04066746542 , 04066336542,";

	public static void validatingBusName() throws Exception {
		/*
		 * reading locators from locators file
		 */
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		actualbusname = driver.findElement(By.xpath(properties.getProperty("validateBusName"))).getText();
		ValidateResult.validateData(actualbusname, expectedbusname, "validatingBusName");
	}

	public static void validatingBusType() {
		actualbustype = driver.findElement(By.xpath(properties.getProperty("validateBusType"))).getText();
		ValidateResult.validateData(actualbustype, expectedbustype, "validatingBusType");
	}

	public static void validatingSeatsNumber() {
		actualseatnumbers = driver.findElement(By.xpath(properties.getProperty("validateSeatNumbers"))).getText();
		ValidateResult.validateData(actualseatnumbers, expectedseatnumbers, "validatingSeatNumbers");
	}

	public static void validatingTotalFare() {
		actualtotalfare = driver.findElement(By.xpath(properties.getProperty("validateTotalFare"))).getText();
		ValidateResult.validateData(actualtotalfare, expectedtotalfare, "validatingTotalFare");
	}

	public static void validatingBordingPoint() {
		actualbordingpoint = driver.findElement(By.xpath(properties.getProperty("validateBoardingPoint"))).getText();
		ValidateResult.validateData(actualbordingpoint, expectedbordingpoint, "validateBoardingPoint");
	}

	public static void validatingBordingPointAddress() {
		actualbordingpointaddress = driver.findElement(By.xpath(properties.getProperty("validateBordingPointAddress")))
				.getText();
		ValidateResult.validateData(actualbordingpointaddress, expectedbordingpointaddress,
				"validateBordingPointAddress");
	}

}
