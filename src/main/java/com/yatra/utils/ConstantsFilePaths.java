package com.yatra.utils;

import java.io.File;

public class ConstantsFilePaths {
	public final static String homeDir = System.getProperty("user.dir") + File.separator;

	public final static String chrome_Home = homeDir + "lib" + File.separator;
	public final static String CHROME_FILE = chrome_Home + "chromedriver.exe";

	public final static String fireFox_Home = homeDir + "lib" + File.separator;
	public final static String FIREFOX_FILE = fireFox_Home + "geckodriver.exe";

	public final static String IE_Home = homeDir + "lib" + File.separator;
	public final static String IE_FILE = IE_Home + "IEDriverServer.exe";

	public final static String config_Home = homeDir + "src\\test\\resources" + File.separator + "config"
			+ File.separator;
	public final static String CONFIG_FILE = config_Home + "config.properties";

	public final static String locators_Home = homeDir + "src\\test\\resources" + File.separator + "locators"
			+ File.separator;
	public final static String LOCATORS_FILE = locators_Home + "locators.properties";

	public final static String log4j_Home = homeDir + "src\\test\\resources" + File.separator + "log4j"
			+ File.separator;
	public final static String LOG4J_FILE = log4j_Home + "log4j.properties";

	public final static String testData_Home = homeDir + "src\\test\\resources" + File.separator + "testdata"
			+ File.separator;
	public final static String TESTDATA_FILE = testData_Home + "inputs1-yatrabusbooking.xlsx";

	public final static String TESTDATA1_FILE = testData_Home + "testdata.properties" + File.separator;
}
