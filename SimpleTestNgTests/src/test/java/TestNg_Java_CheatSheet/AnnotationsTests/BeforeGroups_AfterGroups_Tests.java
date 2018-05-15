package TestNg_Java_CheatSheet.AnnotationsTests;

import org.testng.annotations.*;

public class BeforeGroups_AfterGroups_Tests {

	// NOTE: Run the file BeforeGroups_AfterGroups_Tests.xml to see the output order
	// of execution, the @BeforeGroups and @AfterGroups will execute only for
	// included groups in this class (if they are also included in xml file as well)

	@BeforeGroups(groups = { "Regression" })
	public void Setup_ToRunBeforeGroupTests() {
		// The list of groups that this configuration method will run before. This
		// method is guaranteed to run shortly before the first test method that belongs
		// to any of these groups is invoked.

		System.out.println("Setup_ToRunBeforeGroupTests- Login");
	}

	@Test(groups = { "Smoke" })
	public void testMethod1() {
		System.out.println("testMethod1");
	}

	@Test(groups = { "Smoke", "Regression" })
	public void testMethod2() {
		System.out.println("testMethod2");
	}

	@Test(groups = { "Regression" })
	public void testMethod3() {
		System.out.println("testMethod3");
	}

	@Test(groups = { "Regression" })
	public void testMethod4() {
		System.out.println("testMethod4");
	}

	@AfterGroups(groups = { "Regression" })
	public void Setup_ToRunAfterGroupTests() {
		// The list of groups that this configuration method will run after. This method
		// is guaranteed to run shortly after the last test method that belongs to any
		// of these groups is invoked.
		System.out.println("Setup_ToRunAfterGroupTests - Logout");
	}
}
