package TestNg_Java_CheatSheet.AnnotationsTests;

import org.testng.Assert;
import org.testng.annotations.*;

public class Assert_Tests {
	// Assert is a class in testNG which will help you to do validations/assertions
	// in you test cases to add value to your test case by doing required
	// verifications. If the assertion fails then the test will be marked as fail.

	// We are using Hard Assert here, if any assertion fails, then the test case
	// will fail and execution is terminated at the assertion step where assert
	// failed

	@Test
	public void Assertions_AssertEquals_Test() {

		// There are multiple overloads available for the method 'assertEquals' in
		// Assert class, take help of intellisense to explore more of different
		// overloaded methods relevant to your need
		Assert.assertEquals("Success", "Success"); // actual, expected
		Assert.assertEquals("Pass", "Fail", "Assertion Message, Displayed only when test fails");
		Assert.assertEquals(10, 10, "Drop down count did not match");
		Assert.assertEquals(true, true, "Assert if equal, boolean values");

		
		Assert.assertNotEquals("Success", "Failed", "Verify Status is not 'Success'");
	}
}
