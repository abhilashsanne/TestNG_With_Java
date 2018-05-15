package TestNg_Java_CheatSheet.AnnotationsTests;

import org.testng.annotations.*;

public class BeforeGroups_AfterGroups_Tests {

	@BeforeGroups("Group1")
	public void Setup_ToRunBeforeGroupTests() {
		// The list of groups that this configuration method will run before. This
		// method is guaranteed to run shortly before the first test method that belongs
		// to any of these groups is invoked.
	}
	
	@Test(groups = {"Group1"} )
	public void testMethod2() {
	}


	@AfterGroups("Group1")
	public void Setup_ToRunAfterGroupTests() {
		// The list of groups that this configuration method will run after. This method
		// is guaranteed to run shortly after the last test method that belongs to any
		// of these groups is invoked.
	}
}
