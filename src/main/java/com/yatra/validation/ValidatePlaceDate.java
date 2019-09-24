package com.yatra.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.yatra.testbase.TestBase;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.ReadLocatorsFile;

public class ValidatePlaceDate extends TestBase {
	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualfromplace, actualtoplace, actualdateofjourney;

	public static void validatingFromPlace() throws Exception {
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		actualfromplace = driver.findElement(By.xpath(properties.getProperty("validateFromPlace"))).getAttribute("value");
		ValidateResult.validateData(actualfromplace, properties1.getProperty("expectedfromplace"), "validatingFromPlace");
	}
	public static void validatingToPlace() {
		actualtoplace = driver.findElement(By.xpath(properties.getProperty("validateToPlace"))).getAttribute("value");
		ValidateResult.validateData(actualtoplace, properties1.getProperty("expectedtoplace"), "validatingToPlace");
	}
	public static void validatingDateofJourney() {
		actualdateofjourney = driver.findElement(By.xpath(properties.getProperty("validateDateofJourney"))).getAttribute("value");
		ValidateResult.validateData(actualdateofjourney, properties1.getProperty("expecteddateofjourney"), "validatingdateofjourney");
	}
}