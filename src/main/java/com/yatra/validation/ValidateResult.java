package com.yatra.validation;

import org.testng.Assert;
import com.yatra.utils.LogReports;
public class ValidateResult {
	static LogReports report = new LogReports();

	public static boolean validateData(String actual, String expected, String message) {
		try {
			/*
			 * printing actual and expected values
			 */
			Assert.assertEquals(actual, expected);
			report.info("Passed : " + message + " : " + " Actual data : " + actual + " Expected data : " + expected);
			return true;
		} catch (AssertionError assertionError) {
			report.info("failed : " + message + " : " + " Actual data : " + actual + " Expected data : " + expected);
			return false;
		}
	}
}
