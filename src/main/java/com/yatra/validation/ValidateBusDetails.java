package com.yatra.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.yatra.testbase.TestBase;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.ReadLocatorsFile;

public class ValidateBusDetails extends TestBase {
	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualbusname, actualbustype, actualseatnumbers, actualtotalfare, actualbordingpoint,
			actualbordingpointaddress;

	public static void validatingBusName() throws Exception {
		/*
		 * reading locators from locators file
		 */
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		actualbusname = driver.findElement(By.xpath(properties.getProperty("validateBusName"))).getText();
		ValidateResult.validateData(actualbusname, properties1.getProperty("expectedbusname"), "validatingBusName");
	}

	public static void validatingBusType() {
		actualbustype = driver.findElement(By.xpath(properties.getProperty("validateBusType"))).getText();
		ValidateResult.validateData(actualbustype, properties1.getProperty("expectedbustype"), "validatingBusType");
	}

	public static void validatingSeatsNumber() {
		actualseatnumbers = driver.findElement(By.xpath(properties.getProperty("validateSeatNumbers"))).getText();
		ValidateResult.validateData(actualseatnumbers, properties1.getProperty("expectedseatnumbers"),
				"validatingSeatNumbers");
	}

	public static void validatingTotalFare() {
		actualtotalfare = driver.findElement(By.xpath(properties.getProperty("validateTotalFare"))).getText();
		ValidateResult.validateData(actualtotalfare, properties1.getProperty("expectedtotalfare"),
				"validatingTotalFare");
	}

	public static void validatingBordingPoint() {
		actualbordingpoint = driver.findElement(By.xpath(properties.getProperty("validateBoardingPoint"))).getText();
		ValidateResult.validateData(actualbordingpoint, properties1.getProperty("expectedbordingpoint"),
				"validateBoardingPoint");
	}

	public static void validatingBordingPointAddress() {
		actualbordingpointaddress = driver.findElement(By.xpath(properties.getProperty("validateBordingPointAddress")))
				.getText();
		ValidateResult.validateData(actualbordingpointaddress, properties1.getProperty("expectedbordingpointaddress"),
				"validateBordingPointAddress");
	}

}
