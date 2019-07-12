package saro.automation.learner.reporting;

import org.testng.annotations.Test;

import saro.utils.reporting.GenerateReport_TestNGListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
/*import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
*/

@Listeners(GenerateReport_TestNGListener.class)
public class Reporting_TestNGListeners {
	@Test
	public void testSimulation0() {
		Assert.assertTrue(true);
	}

	@Test
	public void testSimulation00() {
		Assert.assertTrue(false);
	}

	// Test case <testSimulation000> depends on the intentionally
	// failed test case <testSimulation00>
	@Test(dependsOnMethods = "testSimulation00")
	public void testSimulation000() {

	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	/*

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}*/

}
