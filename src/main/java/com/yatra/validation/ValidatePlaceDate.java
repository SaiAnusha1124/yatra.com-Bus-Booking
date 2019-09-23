package com.yatra.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.yatra.testbase.TestBase;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.ReadLocatorsFile;

public class ValidatePlaceDate extends TestBase {
	static String xpath;
	static Properties properties;
	static String actualfromplace;
	static String actualtoplace;
	static String actualdateofjourney;
	static String expectedfromplace = "Hyderabad";
	static String expectedtoplace = "Bangalore";
	static String expecteddateofjourney = "26/09/2019";

	public static void validatingFromPlace() throws Exception {
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		actualfromplace = driver.findElement(By.xpath(properties.getProperty("validateFromPlace")))
				.getAttribute("value");
		ValidateResult.validateData(actualfromplace, expectedfromplace, "validatingFromPlace");
	}

	public static void validatingToPlace() {
		actualtoplace = driver.findElement(By.xpath(properties.getProperty("validateToPlace"))).getAttribute("value");
		ValidateResult.validateData(actualtoplace, expectedtoplace, "validatingToPlace");
	}

	public static void validatingDateofJourney() {
		actualdateofjourney = driver.findElement(By.xpath(properties.getProperty("validateDateofJourney")))
				.getAttribute("value");
		ValidateResult.validateData(actualdateofjourney, expecteddateofjourney, "validatingdateofjourney");
	}
}