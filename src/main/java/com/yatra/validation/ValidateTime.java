
package com.yatra.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.yatra.testbase.TestBase;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.ReadLocatorsFile;
public class ValidateTime extends TestBase {
	static Properties properties;
	static String actualstartingtime;
	static String actualendingtime;
	static String expectedstartingtime = "11:15 PM";
	static String expectedendingtime = "06:45 AM";

	public static void validatingstartingTime() throws Exception {
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		actualstartingtime = driver.findElement(By.xpath(properties.getProperty("validateStartingTime"))).getText();
		Thread.sleep(3000);
		ValidateResult.validateData(actualstartingtime, expectedstartingtime, "validatingStartingTime");
	}

	public static void validatingendingTime() throws Exception {
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		actualendingtime = driver.findElement(By.xpath(properties.getProperty("validateEndingTime"))).getText();
		Thread.sleep(3000);
		ValidateResult.validateData(actualendingtime, expectedendingtime, "validateEndingTime");
	}
}
