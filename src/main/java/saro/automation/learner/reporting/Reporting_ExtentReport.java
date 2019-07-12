package saro.automation.learner.reporting;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import saro.utils.reporting.GenerateReport_Extent;

public class Reporting_ExtentReport extends GenerateReport_Extent {
	
	
	@Test
	public void passTest() {
		// extent.startTest("TestCaseName", "Description")
		// TestCaseName – Name of the test
		// Description – Description of the test
		// Starting test
		logger = extent.startTest("passTest");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}

	@Test
	public void failTest() {
		logger = extent.startTest("failTest");
		Assert.assertTrue(false);
		logger.log(LogStatus.FAIL, "Test Case (failTest) Status is failed");
	}

	@Test
	public void skipTest() {
		logger = extent.startTest("skipTest");
		throw new SkipException("Skipping - This is not ready for testing ");
	}
}
