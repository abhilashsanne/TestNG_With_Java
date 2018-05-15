package TestNg_Java_CheatSheet.SimpleTestNgTests;

import org.testng.annotations.*;

public class SimpleIndividualTests {
	// This class contains two individual test methods implemented using TestNg

	@Test
	public void myFirstIndividualTest() {

		// @Test - This annotation identifies the method as a unit test method
		System.out.println("First test");
	}

	@Test
	public void mySecondIndividualTest() {
		System.out.println("Second test");
	}

	@Test
	public void This_Test_Will_Fail() {
		System.out.println("Second test");
		throw new ArithmeticException();

		// if any test execution fails, it will not stop the execution of other tests
		// cases in the batch/suite. The next test case will continue execution
		// independently
	}

	@Test
	public void This_Test_Will_Run() {

		// Irrespective of execution status (pass/fail) of previous test, this test will
		// be executed and this applies to all tests (TestNG default feature)
		System.out.println("Second test");
	}
}
