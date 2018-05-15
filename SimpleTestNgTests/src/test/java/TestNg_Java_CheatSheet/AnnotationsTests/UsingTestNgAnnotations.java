package TestNg_Java_CheatSheet.AnnotationsTests;

import org.testng.annotations.*;

public class UsingTestNgAnnotations {

	//Begin Region Suites
	@BeforeSuite
	public void SetupMethod_ToRunBeforeSuite() {
		// The annotated method will be run only once before all tests in this suite
		// have run.
	}
	
	@Test
	public void Test_SuiteExample()
	{
		
	}
	@AfterSuite
	public void SetupMethod_ToRunAfterSuite() {
		// The annotated method will be run only once after all tests in this suite have
		// run.
	}
	//EndRegion Suites
	
	
	//Begin Region
	
}
