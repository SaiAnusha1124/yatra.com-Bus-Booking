package com.yatra.testscripts;

import java.util.Properties;
import org.testng.annotations.Test;
import com.yatra.pageactions.PageActions;
import com.yatra.pages.BookingPage;
import com.yatra.testbase.TestBase;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.LogReports;
import com.yatra.utils.ReadLocatorsFile;
import com.yatra.utils.TestDataProvider;
import com.yatra.utils.TestDataProviders;
import com.yatra.validation.ValidateBusDetails;
import com.yatra.validation.ValidatePlaceDate;
import com.yatra.validation.ValidateTime;

public class BusBooking extends TestBase {

	// WebDriver driver;
	Properties properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
	LogReports log = new LogReports();

	@Test(priority = 1)
	public void searchingBus() throws Exception {
		BookingPage.searchingBusPage(driver, properties, log);
		ValidatePlaceDate.validatingFromPlace();
		ValidatePlaceDate.validatingToPlace();
		ValidatePlaceDate.validatingDateofJourney();
	}

	@Test(priority = 2)
	public void selectingBus() throws Exception {
		BookingPage.selectingBusPage(driver, properties, log);
	}

	@Test(priority = 3)
	public void bookingBus() throws Exception {
		BookingPage.bookingBusPage(driver, properties, log);
	}

	@Test(priority = 4,dataProvider = "testdata", dataProviderClass = TestDataProviders.class)
	public void signing(String email,String phoneNumber) throws Exception {
		ValidateTime.validatingstartingTime();
		ValidateTime.validatingendingTime();
		ValidateBusDetails.validatingBordingPoint();
		ValidateBusDetails.validatingBordingPointAddress();
		BookingPage.sendDetailsPage(email,phoneNumber, driver, properties, log);
	}

	@Test( priority = 5,dataProvider = "testdata1", dataProviderClass = TestDataProvider.class)
	public void fillingTravellerDetails(String title, String name, String age) throws Exception {
		BookingPage.fillingDetailsPage(driver, properties, log,title , name , age);
	}
}
		
