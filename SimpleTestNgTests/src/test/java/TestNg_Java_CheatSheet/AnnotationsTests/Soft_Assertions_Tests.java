package TestNg_Java_CheatSheet.AnnotationsTests;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions_Tests {

	// Soft Assert
	// When an assertion fails, don't throw an exception but record the failure.
	// Calling assertAll() will cause an exception to be thrown if at least one
	// assertion failed.

	/*
	 * If any validation fails, it will continue the rest of the script and once
	 * scripts completes then it fails the test
	 * 
	 * It means, even if single validation fails, the script will be failed at the
	 * last but execution will not be interrupted/stopped
	 * 
	 * Don't forget to call assertAll() method at the end
	 */

	@Test(description = "Test to demo 'Soft Assertions'in TestNG")
	public void Soft_Assert_Demo() {
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(32, 35, "This Assertion will fail");

		softAssertion.assertTrue(true, "This assertion will be executed and pass");

		softAssertion.assertNotNull(null, "This assertion will be executed and FAIL");

		softAssertion.assertAll(); //This will check all previous assertions and mark the test as pass or fail
	}
}
