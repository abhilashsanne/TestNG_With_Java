package TestNg_Java_CheatSheet.AnnotationsTests;

import org.testng.annotations.*;

public class BeforeTest_AfterTest_Tests {

	// NOTE: To generate XML file, right click on the
	// BeforeTest_AfterTest_Tests.java file in package explorer and TestNG ->
	// Convert to TestNG (I created file 'testng_BeforeAfterTest' using the same)

	@BeforeTest
	public void Demo_BeforeTest() {
		// Executes before all test cases from all classes in XML file

		// You need to run the tests from XML file to utilize this method functionality
		System.out.println("This is Demo_BeforeTest");
	}

	@Test
	public void DeomTest_BeforeAfterTestMethods() {
		System.out.println("This is test method: DeomTest_BeforeAfterTestMethods");
	}

	@AfterTest
	public void Demo_AfterTest() {
		// Executes after all test cases from all classes in XML file

		// You need to run the tests from XML file to utilize this method functionality
		System.out.println("Demo_AfterTest");
	}
}
