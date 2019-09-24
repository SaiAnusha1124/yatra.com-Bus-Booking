
package com.yatra.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.yatra.testbase.TestBase;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.ReadLocatorsFile;
public class ValidateTime extends TestBase {
	static Properties properties;
	static Properties properties1;
	static String actualstartingtime,actualendingtime;
	
	public static void validatingstartingTime() throws Exception {
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		actualstartingtime = driver.findElement(By.xpath(properties.getProperty("validateStartingTime"))).getText();
		Thread.sleep(3000);
		ValidateResult.validateData(actualstartingtime, properties1.getProperty("expectedstartingtime"), "validatingStartingTime");
	}

	public static void validatingendingTime() throws Exception {
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		actualendingtime = driver.findElement(By.xpath(properties.getProperty("validateEndingTime"))).getText();
		Thread.sleep(3000);
		ValidateResult.validateData(actualendingtime, properties1.getProperty("expectedendingtime"), "validateEndingTime");
	}
}
