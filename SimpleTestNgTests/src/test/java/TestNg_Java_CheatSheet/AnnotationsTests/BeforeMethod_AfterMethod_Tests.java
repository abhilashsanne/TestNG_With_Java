package TestNg_Java_CheatSheet.AnnotationsTests;

import org.testng.annotations.*;

public class BeforeMethod_AfterMethod_Tests {
	@BeforeMethod
	public void Setup_RunOnceBeforeEachTest() {
		// The annotated method will be run before each test method.

		System.out.println("Begin Execution - Setup_RunOnceBeforeEachTest");
	}

	@Test
	public void BeforeMethod_AfterTest_Test_1() {
		System.out.println("Running Test - BeforeMethod_AfterTest_Test_1");
	}

	@Test
	public void BeforeMethod_AfterTest_Test_2() {
		System.out.println("Running Test - BeforeMethod_AfterTest_Test_1");
	}

	@Test
	public void BeforeMethod_AfterTest_Test_3() {
		System.out.println("Running Test - BeforeMethod_AfterTest_Test_1");
	}

	@AfterMethod
	public void Setup_RunOnceAfterEachTest() {
		//The annotated method will be run after each test method.

		System.out.println("End Execution - Setup_RunOnceAfterEachTest");
	}

	/*
	 * Test output to see order of execution:
	 * 
	 * Begin Execution - Setup_RunOnceBeforeEachTest Running Test -
	 * BeforeMethod_AfterTest_Test_1 
	 * End Execution - Setup_RunOnceAfterEachTest
	 * 
	 * Begin Execution - Setup_RunOnceBeforeEachTest 
	 * Running Test - BeforeMethod_AfterTest_Test_1 
	 * End Execution - Setup_RunOnceAfterEachTest
	 * 
	 * Begin Execution - Setup_RunOnceBeforeEachTest 
	 * Running Test - BeforeMethod_AfterTest_Test_1 
	 * End Execution - Setup_RunOnceAfterEachTest
	 */
}
