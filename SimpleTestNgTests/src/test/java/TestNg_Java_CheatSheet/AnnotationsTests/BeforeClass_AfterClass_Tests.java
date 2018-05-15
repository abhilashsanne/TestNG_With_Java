package TestNg_Java_CheatSheet.AnnotationsTests;

import org.testng.annotations.*;

public class BeforeClass_AfterClass_Tests {

	@BeforeClass
	public void Setup_RunOnceBeforeClass() {
		// The annotated method will be run only once before the first test method in
		// the current class is invoked.
		System.out.println("A - Setup_RunOnceBeforeClass");
	}

	@Test
	public void BeforeClass_AfterClass_Test_1() {
		System.out.println("B - BeforeClass_AfterClass_Test_1");
	}

	@Test
	public void BeforeClass_AfterClass_Test_2() {
		System.out.println("C - BeforeClass_AfterClass_Test_2");
	}

	@Test
	public void BeforeClass_AfterClass_Test_3() {
		System.out.println("D - BeforeClass_AfterClass_Test_3");
	}

	@AfterClass
	public void CleanUp_RunOnceAfterClass() {
		// The annotated method will be run only once after all the test methods in the
		// current class have run.
		System.out.println("E - CleanUp_RunOnceAfterClass");
	}

	// On the console you will see the output as "ABCDE" which will help you
	// understand the order in which the tests were executed
}
