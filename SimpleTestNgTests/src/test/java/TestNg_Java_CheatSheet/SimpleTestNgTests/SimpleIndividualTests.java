package TestNg_Java_CheatSheet.SimpleTestNgTests;

import org.testng.annotations.*;


//This class can be executed by right click and selecting "testng_demo.xml" file -> Run As -> TestNG Suite
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

	@Test(enabled = false)
	public void This_Test_Will_Be_Skipped() {
		System.out.println("Skipped test");

		// Enabled annotation is used to mark the test to be Ignored ('Not live', 'Not
		// ready', 'Excluded'). This is useful in scenarios when the test automation is
		// in progress or the test is blocked due to bug and we don't want to run it (as
		// it is known to fail)
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
